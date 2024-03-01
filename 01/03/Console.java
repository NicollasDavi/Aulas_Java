import java.util.Scanner;

public class Console {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String texto = leitor.nextLine();

        System.out.println("Seu nome é:" + texto);

    }
}
