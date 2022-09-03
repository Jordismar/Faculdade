import java.util.Scanner;
public class MainM {
  public static void main(String[] args) {
    Motocicleta moto = new Motocicleta();
    Carro automovel = new Carro();
    Scanner entradaOP = new Scanner(System.in);
    int op = 0;
    do {
      System.out.println("Informe qual das opções deseja entrar");
      System.out.println("1- Cadastrar Motocicleta");
      System.out.println("2- Exibir dados do Motocicleta");
      System.out.println("3- Cadastrar Carro");
      System.out.println("4- Exibir dados do Carro");
      System.out.println("5- Ligar Motor");
      System.out.println("0- Sair");
      op = entradaOP.nextInt();
      if (op > 5 || op < 0) {
        System.out.println("Informe dentres as opções 1 2 3 4 5 0");
      }
      switch (op) {
        case 1:
        moto.preencheMotocicleta();
        break;
        case 2:
        moto.exibeMotocicleta();
        break;
        case 3:
        automovel.preencheCarro();
        break;
        case 4:
        automovel.exibeCarro();
        break;
        case 5:
        moto.vrum();
        break;
      }  
    } while (op != 0);
  }
}