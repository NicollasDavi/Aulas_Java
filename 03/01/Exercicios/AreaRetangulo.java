package Exercicios;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a Altura:");
        float h = scan.nextFloat();
        System.out.println("Digite a Largura");
        float l = scan.nextFloat();

        float Area = h * l;

        System.out.println("A Area do retangulo é: " + Area);


        scan.close();
    }
}
