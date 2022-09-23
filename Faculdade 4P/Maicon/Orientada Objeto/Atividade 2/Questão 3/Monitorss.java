
import java.util.Scanner;

public class Monitorss {
  public String nome;
  public int serial;
  public String marca;
  public int anoLancamento;
  public int polegada;

    Scanner entrada = new Scanner(System.in);

  public Monitorss (){
    this.nome = "";
    this.serial = 0;
    this.marca = "";
    this.anoLancamento = 0;
    this.polegada = 0;
  }
  private static void clearBuffer(Scanner scanner) {
    if (scanner.hasNextLine()) {
        scanner.nextLine();
    }
}
  public void preencheDadosMonitor(){
    System.out.println("Preenchendo dados do Monitor");
    System.out.print("Informe Nome do Monitor -> ");
    this.nome = entrada.nextLine();

    System.out.print("Informe Seiral do Monitor -> ");
    this.serial = entrada.nextInt();

    System.out.print("Informe Marca do Monitor -> ");
    clearBuffer(entrada);
    this.marca = entrada.nextLine();

    System.out.print("Informe Ano de Lançamento do Monitor -> ");
    this.anoLancamento = entrada.nextInt();

    System.out.print("Informe quantas Polegadas ha este Monitor -> ");
    this.polegada = entrada.nextInt();


  }
  public void exibeDadosMonitor(){
    System.out.println("Nome -> " + this.nome);
    System.out.println("Marca -> " + this.marca );
    System.out.println("Serie -> " + this.serial );
    System.out.println("Ano de lançamento -> " + this.anoLancamento );
    System.out.println("Polegadas -> " + this.polegada );
  }
  public void imprimeNomeMonitor(String nome){
    System.out.println("|-----------------------------|");
    System.out.println("|                             |");
    System.out.println("|                             |");
    System.out.println("|      Congratulation         |");
    System.out.println("|       "+nome+"              |");
    System.out.println("|                             |");
    System.out.println("|                             |");
    System.out.println("|-----------------------------|");
  }
  
}
