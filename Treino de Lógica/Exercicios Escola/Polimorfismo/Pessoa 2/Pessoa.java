class Pessoa {

    public void saudacao(String tipo) {
        if (tipo.equals("aluno")) {
            System.out.println("Olá, aluno!");
        } else if (tipo.equals("professor")) {
            System.out.println("Bom dia, professor!");
        } else {
            System.out.println("Olá!");
        }
    }
}