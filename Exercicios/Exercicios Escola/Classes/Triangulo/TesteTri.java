package Triangulo;
public class TesteTri {
    public static void main(String[] args) {
        MoldeTri triangulo = new MoldeTri();

        triangulo.circunferencia = 30;
        triangulo.cor = "Azul";
        triangulo.MostraCor();
        triangulo.TrocaCor();
        triangulo.MostraCor();
    }
}
