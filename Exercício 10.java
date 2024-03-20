import java.util.Scanner;

public class Lojinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lojinha do Sr. Aboo");

        System.out.print("Digite o valor de compra do produto: R$");
        double valorCompra = scanner.nextDouble();

        double porcentagemLucro;
        if (valorCompra < 10.00) {
            porcentagemLucro = 0.7;
        } else if (valorCompra < 30.00) {
            porcentagemLucro = 0.5;
        } else if (valorCompra < 50.00) {
            porcentagemLucro = 0.4;
        } else {
            porcentagemLucro = 0.3;
        }

        double valorVenda = valorCompra * (1 + porcentagemLucro);

        System.out.printf("Porcentagem de lucro: %.2f%%\n", porcentagemLucro * 100);
        System.out.printf("Valor de venda: R$%.2f\n", valorVenda);

        scanner.close();
    }
}