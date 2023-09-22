import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite um Número: ");
            int n = teclado.nextInt();

            if (n < 100 && n > 200) {
                System.out.println("O Numero " + n + " Está entre 100 e 200");
            } else {
                System.out.println("O Número " + n + " não Está Entre 100 e 200");
            }
        }
    }
}
