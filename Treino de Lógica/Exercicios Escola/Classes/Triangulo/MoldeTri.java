package Triangulo;

import java.util.Scanner;

public class MoldeTri {
    Scanner entrada = new Scanner(System.in);
    public String cor;
    public String material;
    public int circunferencia;

    public void MostraCor(){
        System.out.println(cor);
    }

    public void TrocaCor(){
        System.out.print("Nova Cor: ");
        String NovaCor = entrada.nextLine();
        cor = NovaCor;
    } 
}
