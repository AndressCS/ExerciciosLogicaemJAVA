import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("|-------BANCO------|");
        System.out.println("--------------------");

        System.out.print("Qual Foi o Valor Depositado: ");
        float valor = teclado.nextFloat();
        float ren = (float) ((0.07*valor)/100);
        System.out.println("Após um Mês de Rendimento o Valor Será: " + (valor + ren));
    }
}
