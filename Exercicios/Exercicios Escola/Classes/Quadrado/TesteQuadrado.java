    package Quadrado;

    public class TesteQuadrado {
        public static void main(String[] args) {
            MoldeQuad quadrado1 = new MoldeQuad();
            quadrado1.tamanho = 7.0;
            quadrado1.CalcularArea();
            quadrado1.MudarValorDoLado();
            quadrado1.CalcularArea();
        }
    }
