import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);

System.out.println("Digite o comprimento dos três lados do triangulo: ");
System.out.print ("Lado 1: ");
double lado1 = scanner.nextDouble();
System.out.print ("Lado 2: ");
double lado2 = scanner.nextDouble();
System.out.print("Lado 3: ");
double lado3 = scanner.nextDouble();

if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
    if (lado1 == lado2 && lado2 == lado3) {
        System.out.println("O triângulo é equilátero.");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        System.out.println("O triângulo é isósceles.");
    } else {
        System.out.println("O triângulo é escaleno.");
    }
} else {
    System.out.println("Os lados fornecidos não formam um triângulo válido.");
}

scanner.close();
}
}