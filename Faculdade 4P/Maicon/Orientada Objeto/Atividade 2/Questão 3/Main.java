import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Monitorss um = new Monitorss();
    Scanner entradaOP = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);
    String exibe = "";
    int op = 0;
    do {
      System.out.println("Informe qual das opções deseja entrar");
      System.out.println("1- Cadastrar monitor");
      System.out.println("2- Exibir dados do Monitor");
      System.out.println("3- Imprimir algo na tela");
      System.out.println("0- Sair");
      op = entradaOP.nextInt();
      if (op > 3 || op < 0) {
        System.out.println("Informe dentres as opções 1 2 3 0");
      }
      switch (op) {
        case 1:
        um.preencheDadosMonitor();
        break;
        case 2:
        um.exibeDadosMonitor();
        break;
        case 3:
        System.out.print("Informe o que quer exibir-> ");
        exibe = entradaString.nextLine();
        um.imprimeNomeMonitor(exibe);
        break;
      }  
    } while (op != 0);
  }
}