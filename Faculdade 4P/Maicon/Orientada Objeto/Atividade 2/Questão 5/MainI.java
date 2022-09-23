import java.util.Scanner;
public class MainI {
  public static void main(String[] args) {
    Impressora impr = new Impressora();
    
    Scanner entradaOP = new Scanner(System.in);
    int op = 0;
    int imp = 0;
    do {
      System.out.print("Selecione qual das 5 Impressoras vai utilizar -> ");
      imp = entradaOP.nextInt();
      System.out.println("Informe qual das opções deseja entrar");
      System.out.println("1- Cadastrar Impressora");
      System.out.println("2- Exibir dados do Impressora");
      System.out.println("3- Salvar frase que ira imprimir");
      System.out.println("4- Imprimir frase salva");
      System.out.println("0- Sair");
      op = entradaOP.nextInt();
      if (op > 4 || op < 0) {
        System.out.println("Informe dentres as opções 1 2 3 4 0");
      }
      switch (op) {
        case 1:
        impr.preencheImpressora(imp);
        break;
        case 2:
        impr.exibeImpressora(imp);
        break;
        case 3:
        impr.fraseImpressora(imp);
        break;
        case 4:
        impr.imprimir(imp);
        break;
      }  
    } while (op != 0);
  }
}