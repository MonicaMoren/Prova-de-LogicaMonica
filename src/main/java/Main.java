import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Ficha de Inscrição para o Enem");
    System.out.println(" ");
    System.out.println("Insira seus Dados");
    System.out.println(" ");
    System.out.println("Digite seu nome:");
    String Nome = sc.nextLine();
    System.out.println("Digite seu sobrenome:");
    String Sobrenome = sc.nextLine();
    System.out.println("Digite sua idade:");
    int Idade = sc.nextInt();
    System.out.println("Digite sua altura:");
    Double Altura = sc.nextDouble();
    System.out.println("Digite seu peso:");
    Double Peso = sc.nextDouble();
    System.out.println("Digite seu Sexo:");
    System.out.println("2 - Masculino");
    System.out.println("1 - Feminino");
    int Sexo = sc.nextInt();
    System.out.println(" ");
    System.out.println("Confirma seus Dados");
    System.out.println("Se obter erro nos dados, Reinicie o programa");
    System.out.println(" ");
    System.out.println("Nome " + Nome);
    System.out.println("Sobrenome " + Sobrenome);
    System.out.println("Idade "+ Idade);
    System.out.println("Altura " + Altura);
    System.out.println("Peso " + Peso );
    System.out.println("Sexo " + Sexo);

    




    
  sc.close();
  }

}