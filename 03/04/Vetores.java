import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int[] vet1 = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor da posição" + (i+1));
            vet1[i] = scan.nextInt();
        }
        boolean executar = true;
        int contador = 0;
        int vlrVetor = vet1[contador];
        if (vlrVetor > 100) {
            executar = false;
        }
        while (executar && contador < 3) {
            System.out.println("O valor atribuido para o indice " + contador + ", foi " + vlrVetor );
            contador ++;
        }

        //zerar vet1
        contador = 0;
        do {
            //Valor esta zerado?
            if (vet1[0] == 0) {
                break;
            }
            vet1[contador] = 0;
            contador ++;
        } while (contador < 3);
        scan.close();
    }
}
