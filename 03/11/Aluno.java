import java.util.Scanner;

public class Aluno {

    static class InnerAluno {
        int matricula;
        String nome;
        String aprovado;
        float ntFinal;
    }

    public static void print(String texto) {
        System.out.println(texto);
    }

    public static void printA(Aluno.InnerAluno[] alunos) {
        for (InnerAluno aluno : alunos) {
            System.out.println("Matricula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Aprovado: " + aluno.aprovado);
            System.out.println("Nota Final: " + aluno.ntFinal);
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {

        int num = 1;
        InnerAluno[] Alunos = new InnerAluno[num];

        for (int i = 0; i < Alunos.length; i++) {
            Scanner scan = new Scanner(System.in);
            InnerAluno AlunoAtual = new InnerAluno();
            int op = 1;
            do {
                print("Digite a matricula:\n");
                AlunoAtual.matricula = scan.nextInt();
                print("Digite o Nome:\n");
                AlunoAtual.nome = scan.next();
                print("Esta aprovado?\n");
                AlunoAtual.aprovado = scan.next();
                print("Qual a media?\n");
                AlunoAtual.ntFinal = scan.nextFloat();
    
                Alunos[i] = AlunoAtual;
    
                print("Deseja continuar? Digite 0 para parar\n");
                op = scan.nextInt();
                
                num += 1;
            } while (op != 0);
                
            

            scan.close();

        }
        printA(Alunos);
    }
}
