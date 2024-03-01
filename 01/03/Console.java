import java.util.Scanner;

public class Console {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        boolean executar = true;
        int contador = 0;

        String[] letras = new String[]{"A", "B", "C"};

        System.out.println("Posição 1:" + letras[0]);


        for(int i =0 ; i < letras.length ; i++ ){
            System.out.println("Letra:" + letras[i]);
        }

        while (executar && contador < letras.length) {
            System.out.println("Letras:" + letras[contador]);
            contador++;
        }

        // int a = 10;
        // int b = 5;
        // double resultado = a+b;
        // int resultadoInteiro = (int) resultado; //casting
        // var resultadoDinamico = a+b;
        // var resultadoString = a+b;

        // System.out.println("Digite seu nome:");
        // String texto = leitor.nextLine();

        // System.out.println("Seu nome é:" + texto);

        // System.out.println("Digite sua idadeuhu");
        // int idade = leitor.nextInt();

        // System.out.println("Sua idade é: " + idade);
        // System.out.println("O resultado é " + resultadoInteiro);
        // System.out.println("O resultado é " + resultadoDinamico);
        // System.out.println("O resultado é " + resultadoString);
        

        // System.out.println("Digite a nota A");
        // var a = leitor.nextInt();

        // System.out.println("Digite a nota b");
        // var b = leitor.nextInt();

        // double result = a+b;
        // System.out.println("resultado:" + result);

        // if (result >=6) {
        //     System.out.println("Aprovado");
        // }else{
        //     System.out.println("Reprovado");
        // }




        leitor.close();
    }
}
