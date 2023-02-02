
//Usando diferentes métodos para ler dados de diferentes tipos
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Entre com nome, Idade e Sálario ");

    String nome = myObj.nextLine();

    int idade = myObj.nextInt();
    double salario = myObj.nextDouble();

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sálario: " + salario);

  }
}