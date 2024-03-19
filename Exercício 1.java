import java.util.Scanner;

public class CalculadoraDivisao {
    public static void main(String[] args) {
 Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();

           if (numero1 !=0) { int resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é:" + resultado);

            } else {
            System.out.println("Não é possivel dividir por zero");

            scanner.close();
            
            
        }
    }
}
