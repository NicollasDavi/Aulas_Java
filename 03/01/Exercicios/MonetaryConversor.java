package Exercicios;
import java.util.Scanner;

public class MonetaryConversor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em R$:");
        float valor = scan.nextFloat();

        float dolar = (float) (valor / 5.17);
        float euro = (float) (valor / 6.14);
        float peso = (float) (valor / 0.05);

        System.out.println("Valor em Dolar: " + dolar);
        System.out.println("Valor em Euro: " + euro);
        System.out.println("Valor em Pesos Argentinos: " + peso); 

        scan.close();
    }
}
