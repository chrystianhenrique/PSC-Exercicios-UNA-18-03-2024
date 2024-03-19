import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) { 
 Scanner scanner = new Scanner (System.in);

 System.out.println("Qual o numero total de eleitores? ");
        int eleitores = scanner.nextInt();

System.out.println("Qual o numero de votos brancos? ");
        int votosBrancos = scanner.nextInt();
        
System.out.println("Qual o numero de votos nulos? ");
        int votosNulos = scanner.nextInt();

System.out.println("Qual o numero de votos válidos? ");
        int votosValidos = scanner.nextInt();

double percentualBrancos = (double) votosBrancos / eleitores * 100;

double percentualNulos = (double) votosNulos / eleitores * 100;

double percentualValidos = (double) votosValidos / eleitores * 100;

System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
System.out.println("Percentual de votosValidos " + percentualValidos + "%");

scanner.close();

    }
}




