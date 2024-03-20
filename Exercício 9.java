import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);

System.out.print("QUAL A IDADE DA PESSOA?: ");
int idade = scanner.nextInt();

String classificacao = "";
if (idade < 16) {
    classificacao = "Não é eleitor";
} else if (idade >= 16 && idade <= 17) {
    classificacao = "Eleitor facultativo";
} else if (idade >= 18 && idade <= 65) {
    classificacao = "Eleitor obrigatório";
} else {
    classificacao = "Eleitor facultativo";
}
System.out.println("Saída: " + classificacao);

        scanner.close();
    }
}