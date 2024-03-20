import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String situacaoPeso;
        if (imc < 20) {
            situacaoPeso = "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            situacaoPeso = "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            situacaoPeso = "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            situacaoPeso = "Obeso";
        } else {
            situacaoPeso = "Obeso Mórbido";
        }

        System.out.println("Situação do peso: " + situacaoPeso);

        scanner.close();
    }
}