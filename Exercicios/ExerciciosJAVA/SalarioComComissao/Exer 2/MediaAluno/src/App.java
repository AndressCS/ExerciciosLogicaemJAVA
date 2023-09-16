import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o nome do Aluno: ");
        String aluno = teclado.nextLine();
        
        int i = 1;
        float[] nota = new float[3];
        

        while(i <= 3) {
            System.out.print("Qual é a " + i + "º Nota? ");
            nota[i] = teclado.nextFloat();         
            i++;
        }
        
        
        





        
        
    }
}
