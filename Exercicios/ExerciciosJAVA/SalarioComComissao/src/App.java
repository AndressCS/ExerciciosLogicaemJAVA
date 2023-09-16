import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-----------------------");
        System.out.println("--CALCULO-DE-COMISSÃO--");
        System.out.println("-----------------------");
        
        System.out.print("Qual o Seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Qual o Seu Salarío: ");
        float sal = teclado.nextFloat();
        System.out.print("Digite o Total de Vendas em R$: ");
        float com = teclado.nextFloat();
        
        double c = 15*com/100 + sal;
        
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + sal);
        System.out.println("Total de Vendas R$: " + com);
        System.out.println("Salarío com Comissão: " + c);
        
    }
}
