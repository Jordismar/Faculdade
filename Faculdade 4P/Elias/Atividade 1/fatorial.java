import java.util.Scanner;

public class fatorial {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int num = 0;
    System.out.print("Informe um numero -> ");
    num = entrada.nextInt();
    int aux = num;
    int result = num;
    while (aux > 1) {
      aux--;
      result = result * aux;
    }
    System.out.println("Fatorial de " + num + " -> " + result);
  }

}
