import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o nome do Aluno: ");
        String aluno = teclado.nextLine();
        
        System.out.println("Digite a Primeira NOTA: ");
        float n1 = teclado.nextInt();

        System.out.println("Digite a Segunda NOTA: ");
        float n2 = teclado.nextInt();

        System.out.println("Digite a Terceira NOTA: ");
        float n3 = teclado.nextInt();

        float r = (n1 + n2 + n3) / 3;

        if (r >= 6) {
            System.out.println("Parabéns " + aluno + " Sua Medía Foi " + r + " Você foi Aprovado!");
        }else{
            System.out.println(aluno + ", Sua Medía foi " + r + " Você Foi Reprovado!");
        }
        
        
        





        
        
    }
}
