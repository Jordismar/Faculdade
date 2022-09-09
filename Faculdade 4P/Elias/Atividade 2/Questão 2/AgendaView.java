import java.util.Scanner;

public class AgendaView {
  public static void main(String[] args) {
    int op = 0;
    int quant = 0;
    Scanner entradaOp = new Scanner(System.in);
    Agenda agend = new Agenda(quant);
    do {
      System.out.println("1-Adicionar nova Pessoa a Agenda");
      System.out.println("2-Imprimir Agenda completa");
      System.out.println("0-Sair");
      System.out.print("Informe a opção valida -> ");
      op = entradaOp.nextInt();

      switch (op) {
        case 1:
          agend.newPessoa(quant);
          quant++;
          break;
        case 2:
          // agend.imprimeAgenda();
          break;

        default:
          System.out.println("Informe uma opção valida");
          break;
      }
    } while (op != 0);
  }
}
