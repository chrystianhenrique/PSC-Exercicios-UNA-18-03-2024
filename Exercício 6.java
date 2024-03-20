import java.util.Scanner;

public class EstacoesDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma estação do ano:");
        System.out.println("1 - Primavera");
        System.out.println("2 - Verão");
        System.out.println("3 - Outono");
        System.out.println("4 - Inverno");
        System.out.print("Insira o número correspondente à estação desejada: ");

        int escolha = scanner.nextInt();


        switch (escolha) {
            case 1:
                System.out.println("Primavera: Bem vindo a Primavera!");
                break;
            case 2:
                System.out.println("Verão: Bem vindo ao verão!");
                break;
            case 3:
                System.out.println("Outono: Bem vindo ao outono!");
                break;
            case 4:
                System.out.println("Inverno: Bem vindo ao inverno!");
                break;
            default:
                System.out.println("Número inválido. Por favor, escolha um número de 1 a 4.");
        }

        scanner.close();
    }
}