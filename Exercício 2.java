import java.util.Scanner;

public class Notas {
    public static void main(String[] args) { 
 Scanner scanner = new Scanner (System.in);

 System.out.println("Digite a nota da 1ª avaliação de 0 a 10:");
 double nota1 = scanner.nextDouble();

 System.out.println("Digite a nota da 2ª avaliação de 0 a 10:");
 double nota2 = scanner.nextDouble();

 System.out.println("Digite a nota da 3ª avaliação de 0 a 10:");
 double nota3 = scanner. nextDouble();

 double media = (nota1 + nota2 + nota3) / 3;
     
      if (media >=7) {
        System.out.println ("\n Aluno Aprovado!"); 
    System.out.println ("\n A média do aluno foi: " + media);

      }else {
        System.out.println ("\nAluno Reprovado!");

  System.out.println ("\n A média do aluno foi: " + media);  

scanner.close();
      }
    }
}

