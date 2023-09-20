import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("-----CARANGO-VELHO-----");
        System.out.println("-----------------------");

        System.out.print("Digite o Valor do Carro: ");
        float v = leia.nextFloat();
        System.out.print("Digite o Ano do carro: ");
        int ano = leia.nextInt();

        float des12 = (12*v)/100;
        float des7 = (7*v)/100;

        if (ano <= 2000) {
          System.out.println("o Valor do Carro com o Desconto Será: " + (v - des12));
        }else if (ano >= 2000) {
            System.out.println("o Valor do Carro com o Desconto Será: " + (v - des7));
        }
    }
}
