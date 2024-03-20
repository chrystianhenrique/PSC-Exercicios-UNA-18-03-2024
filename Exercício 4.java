import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        double salario;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        else if(salario <= 2000) {
            salario *= taxaAumento2;
        }

        else if(salario <= 3000) {
            salario *= taxaAumento1;
        }

        else 
        
        {
            salario *= taxaAumento1; 
            salario += 200;
        }

        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        // O programa tinha erro de logica, por usar somente "if" o que gerava aumentos incorretos. 
    }
}

