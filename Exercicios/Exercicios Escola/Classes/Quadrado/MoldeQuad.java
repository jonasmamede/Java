package Quadrado;

import java.util.Scanner;


public class MoldeQuad {
    Scanner entrada = new Scanner(System.in);
    public Double tamanho;
    
    public void MudarValorDoLado(){
        System.out.println("Mudar valor: ");
        Double NovoTamanho = entrada.nextDouble();
        tamanho = NovoTamanho;
    }

    public void CalcularArea(){
        Double Calculo = tamanho*tamanho;
        System.out.println(Calculo);
    }
    
}
