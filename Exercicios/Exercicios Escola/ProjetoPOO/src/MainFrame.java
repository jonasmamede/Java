import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class MainFrame extends JFrame {
    private JTextField campoValor;
    private JTextField campoTempo;
    private JComboBox<String> comboTipo;
    private JTextArea areaResultado;
    private JTextArea areaHistorico;
    private JPanel painelGrafico;
    private SimuladorService simulador;

    private double ultimoValorPoupanca = 0;
    private double ultimoValorCDB = 0;
    private double ultimoValorTesouro = 0;
    private boolean mostrarGrafico = false;

    public MainFrame() {
        setTitle("Jonas Investimentos - Simulador Premium");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        simulador = new SimuladorService();

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel painelEntrada = criarPainelEntrada();
        JPanel painelSaida = criarPainelSaida();

        painelPrincipal.add(painelEntrada, BorderLayout.WEST);
        painelPrincipal.add(painelSaida, BorderLayout.CENTER);

        add(painelPrincipal);
    }

    private JPanel criarPainelEntrada() {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createTitledBorder("Entrada de Dados"));
        painel.setPreferredSize(new Dimension(250, 0));

        JLabel labelValor = new JLabel("Valor Inicial (R$):");
        labelValor.setFont(new Font("Arial", Font.PLAIN, 12));
        campoValor = new JTextField();
        campoValor.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        campoValor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != '.') {
                    e.consume();
                }
            }
        });

        JLabel labelTempo = new JLabel("Tempo (meses):");
        labelTempo.setFont(new Font("Arial", Font.PLAIN, 12));
        campoTempo = new JTextField();
        campoTempo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        campoTempo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume();
                }
            }
        });

        JLabel labelTipo = new JLabel("Tipo de Investimento:");
        labelTipo.setFont(new Font("Arial", Font.PLAIN, 12));
        comboTipo = new JComboBox<>(new String[] { "Poupança", "CDB", "Tesouro Direto" });
        comboTipo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JPanel painelBotoes = criarPainelBotoes();

        painel.add(labelValor);
        painel.add(Box.createVerticalStrut(5));
        painel.add(campoValor);
        painel.add(Box.createVerticalStrut(15));

        painel.add(labelTempo);
        painel.add(Box.createVerticalStrut(5));
        painel.add(campoTempo);
        painel.add(Box.createVerticalStrut(15));

        painel.add(labelTipo);
        painel.add(Box.createVerticalStrut(5));
        painel.add(comboTipo);
        painel.add(Box.createVerticalStrut(20));

        painel.add(painelBotoes);
        painel.add(Box.createVerticalGlue());

        return painel;
    }

    private JPanel criarPainelBotoes() {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JButton btnSimular = new JButton("Simular");
        btnSimular.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        btnSimular.setFont(new Font("Arial", Font.BOLD, 12));
        btnSimular.setBackground(new Color(40, 120, 200));
        btnSimular.setForeground(Color.WHITE);
        btnSimular.addActionListener(e -> acaoSimular());

        JButton btnComparar = new JButton("Comparar Investimentos");
        btnComparar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        btnComparar.setFont(new Font("Arial", Font.BOLD, 12));
        btnComparar.setBackground(new Color(40, 160, 80));
        btnComparar.setForeground(Color.WHITE);
        btnComparar.addActionListener(e -> acaoComparar());

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
        btnLimpar.setBackground(new Color(200, 120, 40));
        btnLimpar.setForeground(Color.WHITE);
        btnLimpar.addActionListener(e -> acaoLimpar());

        JButton btnSair = new JButton("Sair");
        btnSair.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        btnSair.setFont(new Font("Arial", Font.BOLD, 12));
        btnSair.setBackground(new Color(200, 40, 40));
        btnSair.setForeground(Color.WHITE);
        btnSair.addActionListener(e -> System.exit(0));

        painel.add(btnSimular);
        painel.add(Box.createVerticalStrut(8));
        painel.add(btnComparar);
        painel.add(Box.createVerticalStrut(8));
        painel.add(btnLimpar);
        painel.add(Box.createVerticalStrut(8));
        painel.add(btnSair);

        return painel;
    }

    private JPanel criarPainelSaida() {
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout(10, 10));

        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new BoxLayout(painelSuperior, BoxLayout.Y_AXIS));
        painelSuperior.setBorder(BorderFactory.createTitledBorder("Resultado"));
        painelSuperior.setPreferredSize(new Dimension(0, 250));

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font("Courier New", Font.PLAIN, 11));
        areaResultado.setBackground(new Color(240, 240, 240));
        JScrollPane scrollResultado = new JScrollPane(areaResultado);
        painelSuperior.add(scrollResultado);

        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new BorderLayout(10, 10));

        JPanel painelEsquerda = new JPanel();
        painelEsquerda.setLayout(new BoxLayout(painelEsquerda, BoxLayout.Y_AXIS));
        painelEsquerda.setBorder(BorderFactory.createTitledBorder("Histórico"));
        painelEsquerda.setPreferredSize(new Dimension(300, 0));

        areaHistorico = new JTextArea();
        areaHistorico.setEditable(false);
        areaHistorico.setFont(new Font("Courier New", Font.PLAIN, 10));
        areaHistorico.setBackground(new Color(240, 240, 240));
        JScrollPane scrollHistorico = new JScrollPane(areaHistorico);
        painelEsquerda.add(scrollHistorico);

        painelGrafico = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (mostrarGrafico) {
                    desenharGrafico(g);
                }
            }
        };
        painelGrafico.setBorder(BorderFactory.createTitledBorder("Gráfico Comparativo"));
        painelGrafico.setBackground(new Color(250, 250, 250));

        painelInferior.add(painelEsquerda, BorderLayout.WEST);
        painelInferior.add(painelGrafico, BorderLayout.CENTER);

        painel.add(painelSuperior, BorderLayout.NORTH);
        painel.add(painelInferior, BorderLayout.CENTER);

        return painel;
    }

    private void acaoSimular() {
        try {
            String valor = campoValor.getText().trim();
            String tempo = campoTempo.getText().trim();

            if (valor.isEmpty() || tempo.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, preencha todos os campos.",
                        "Campos Vazios",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            double valorInvestimento = Double.parseDouble(valor);
            int tempoMeses = Integer.parseInt(tempo);
            String tipoInvestimento = (String) comboTipo.getSelectedItem();

            double valorFinal = simulador.simularInvestimento(tipoInvestimento, valorInvestimento, tempoMeses);

            double lucro = valorFinal - valorInvestimento;
            double rentabilidade = (lucro / valorInvestimento) * 100;

            Investimento inv = null;
            switch (tipoInvestimento) {
                case "Poupança":
                    inv = new Poupanca(valorInvestimento, tempoMeses);
                    break;
                case "CDB":
                    inv = new CDB(valorInvestimento, tempoMeses);
                    break;
                case "Tesouro Direto":
                    inv = new TesouroDireto(valorInvestimento, tempoMeses);
                    break;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("========== RESULTADO DA SIMULAÇÃO ==========\n\n");
            sb.append(String.format("Tipo do Investimento:  %s\n", tipoInvestimento));
            sb.append(String.format("Valor Investido:       R$ %.2f\n", valorInvestimento));
            sb.append(String.format("Tempo:                 %d meses\n", tempoMeses));
            sb.append(String.format("Taxa Utilizada:        %.2f%% ao ano\n", inv.getTaxaAnual() * 100));
            sb.append(String.format("Valor Final:           R$ %.2f\n", valorFinal));
            sb.append(String.format("Lucro Obtido:          R$ %.2f\n", lucro));
            sb.append(String.format("Rentabilidade:         %.2f%%\n", rentabilidade));
            sb.append("\n");
            sb.append(inv.obterDescricao());

            areaResultado.setText(sb.toString());

            atualizarHistorico();
            mostrarGrafico = false;
            painelGrafico.repaint();

        } catch (ValorInvalidoException | TempoInvalidoException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, insira valores numéricos válidos.",
                    "Formato Inválido",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro inesperado: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void acaoComparar() {
        try {
            String valor = campoValor.getText().trim();
            String tempo = campoTempo.getText().trim();

            if (valor.isEmpty() || tempo.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, preencha todos os campos.",
                        "Campos Vazios",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            double valorInvestimento = Double.parseDouble(valor);
            int tempoMeses = Integer.parseInt(tempo);

            Poupanca poupanca = new Poupanca(valorInvestimento, tempoMeses);
            CDB cdb = new CDB(valorInvestimento, tempoMeses);
            TesouroDireto tesouro = new TesouroDireto(valorInvestimento, tempoMeses);

            ultimoValorPoupanca = poupanca.calcularRetorno();
            ultimoValorCDB = cdb.calcularRetorno();
            ultimoValorTesouro = tesouro.calcularRetorno();

            List<String> resultados = simulador.compararInvestimentos(valorInvestimento, tempoMeses);

            StringBuilder sb = new StringBuilder();
            sb.append("========== COMPARAÇÃO DE INVESTIMENTOS ==========\n\n");
            for (String resultado : resultados) {
                sb.append(resultado);
            }

            areaResultado.setText(sb.toString());
            atualizarHistorico();

            mostrarGrafico = true;
            painelGrafico.repaint();

        } catch (ValorInvalidoException | TempoInvalidoException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, insira valores numéricos válidos.",
                    "Formato Inválido",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro inesperado: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void acaoLimpar() {
        campoValor.setText("");
        campoTempo.setText("");
        comboTipo.setSelectedIndex(0);
        areaResultado.setText("");
        simulador.limparHistorico();
        areaHistorico.setText("");
        mostrarGrafico = false;
        painelGrafico.repaint();
    }

    private void atualizarHistorico() {
        List<String> historico = simulador.obterHistorico();
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo | Valor | Meses | Resultado\n");
        sb.append("================================\n");
        for (String registro : historico) {
            sb.append(registro).append("\n");
        }
        areaHistorico.setText(sb.toString());
    }

    private void desenharGrafico(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int margem = 50;
        int largura = painelGrafico.getWidth() - 2 * margem;
        int altura = painelGrafico.getHeight() - 2 * margem;

        double maximo = Math.max(Math.max(ultimoValorPoupanca, ultimoValorCDB), ultimoValorTesouro);

        int barraAltura = 40;
        int espacoEntreBarras = 30;
        int posY = margem + 20;

        g2d.drawString("Poupança", margem, posY);
        int comprimentoBarra1 = (int) ((ultimoValorPoupanca / maximo) * largura);
        g2d.setColor(new Color(70, 180, 100));
        g2d.fillRect(margem + 100, posY - 15, comprimentoBarra1, 20);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(margem + 100, posY - 15, comprimentoBarra1, 20);
        g2d.drawString(String.format("R$ %.2f", ultimoValorPoupanca), margem + 110 + comprimentoBarra1, posY + 3);

        posY += espacoEntreBarras + 30;
        g2d.drawString("CDB", margem, posY);
        int comprimentoBarra2 = (int) ((ultimoValorCDB / maximo) * largura);
        g2d.setColor(new Color(70, 120, 200));
        g2d.fillRect(margem + 100, posY - 15, comprimentoBarra2, 20);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(margem + 100, posY - 15, comprimentoBarra2, 20);
        g2d.drawString(String.format("R$ %.2f", ultimoValorCDB), margem + 110 + comprimentoBarra2, posY + 3);

        posY += espacoEntreBarras + 30;
        g2d.drawString("Tesouro Direto", margem, posY);
        int comprimentoBarra3 = (int) ((ultimoValorTesouro / maximo) * largura);
        g2d.setColor(new Color(200, 150, 50));
        g2d.fillRect(margem + 100, posY - 15, comprimentoBarra3, 20);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(margem + 100, posY - 15, comprimentoBarra3, 20);
        g2d.drawString(String.format("R$ %.2f", ultimoValorTesouro), margem + 110 + comprimentoBarra3, posY + 3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
