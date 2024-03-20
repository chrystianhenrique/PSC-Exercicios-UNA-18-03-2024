import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Caixa Eletrônico");
        System.out.println("Opções disponíveis:");
        System.out.println("1. Exibir saldo");
        System.out.println("2. Exibir extrato");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar saque");
        System.out.println("5. Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Exibindo saldo...");
                break;
            case 2:
                System.out.println("Exibindo extrato...");
                break;
            case 3:
                System.out.println("Realizando depósito...");
                break;
            case 4:
                System.out.println("Realizando saque...");
                break;
            case 5:
                System.out.println("Saindo do caixa eletrônico...");
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                break;
        }

        scanner.close();
    }
}