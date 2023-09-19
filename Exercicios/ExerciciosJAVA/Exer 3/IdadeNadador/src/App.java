import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------");
        System.out.println("---Faixa-De-Idade---");
        System.out.println("--------------------");

        Scanner leia = new Scanner(System.in);

        System.out.print("Qual a Sua Idade: ");
        int idade = leia.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Sua Categoria é: Infaltíl A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Sua Categoria é: Infaltíl B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Sua Categoria é: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Sua Categoria é: Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Sua Cadegoria é: Sênior");
        } else {
            System.out.println("idade fora da faixa etária");
        }
    }
}
