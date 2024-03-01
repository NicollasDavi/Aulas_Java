package Exercicios;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma idade par ao individuo A: ");
        int idade = scan.nextInt();

        if (idade > 60) {
            System.out.println("O individu0 A é Idoso");
        }else{
            if (idade > 18 && idade <=60) {
                System.out.println("O individuo A é um adulto");
            }else if (idade > 13 && idade <=18) {
                System.out.println("O individuo A é adolecente");
            }else{
                System.out.println("O individuo A é uma criança");
            }
        }



        scan.close();
    }
}
