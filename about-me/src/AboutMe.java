import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.printf("Meu nome é %s %s\n", nome, sobrenome);
        System.out.printf("Minha altura é %.2f\n", altura);
        System.out.printf("Minha idade é %d anos", idade);

        scanner.close();
    }
}
