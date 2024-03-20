import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);

System.out.println("Digite a descrição do produto: ");
String nomeProduto = scanner.nextLine();

System.out.println("Digite a quantidade adquirida: ");
int quantidadeAdquirida = scanner.nextInt ();

System.out.println("Digite o preço unitário do produto: ");
double preçoUnitario = scanner.nextDouble();


double total = quantidadeAdquirida * preçoUnitario;

double desconto = 0;
    if (quantidadeAdquirida <= 5) {
        desconto = total * 0.02;
    
    } else if (quantidadeAdquirida > 5 || quantidadeAdquirida <= 10) {
         desconto = total * 0.03;
    } else if (quantidadeAdquirida > 10 || quantidadeAdquirida < 30) {
         desconto = total * 0.05;
    } else {
         desconto = total * 0.10;
    }

double totalAPagar  = total - desconto;

System.out.println("Descrição do produto: " + nomeProduto);
System.out.println("Quantidade adquirida: " + quantidadeAdquirida);
System.out.println("Preço unitário: R$" + preçoUnitario);
System.out.println("Total: R$" + total);
System.out.println("Desconto: R$" + String.format("%.2f", desconto));
System.out.println("Total a pagar: R$" + String.format("%.2f", totalAPagar));
 
scanner.close();
    }
}
