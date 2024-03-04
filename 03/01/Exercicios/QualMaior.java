package Exercicios;
import java.util.Scanner;

public class QualMaior {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Valor inteiro A:");
        int a = scan.nextInt();
        System.out.println("Digite o Valor inteiro B:");
        int b = scan.nextInt();

        if (a == b) {
            System.out.println("Os valores A e B são iguais");
        }else{
            if (a > b ) {
                System.out.println("O Valor A é maior!");
            }else{
                System.out.println("O Valor B é maior!");
            }
        }
        


        scan.close();
    }
}
