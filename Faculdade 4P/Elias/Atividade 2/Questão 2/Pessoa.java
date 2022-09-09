import java.util.Scanner;

public class Pessoa {
  public String nome;
  public int idade;
 // public boolean cadastrada;
 
 public Pessoa(){
   this.nome = "";
   this.idade = 0;
   // this.cadastrada = false;
  }
  private static void clearBuffer(Scanner scanner) {
    if (scanner.hasNextLine()) {
        scanner.nextLine();
    }
  }
  public void cadastraPessoa(){
    Scanner entradaP = new Scanner(System.in);
    System.out.println("Nova pessoa:");
    System.out.println("\n");
    System.out.print("Nome -> ");
    clearBuffer(entradaP);
    this.nome = entradaP.nextLine();
    System.out.print("Idade -> ");
    this.idade = entradaP.nextInt();
   // this.cadastrada = true;
  }

  public void exibePessoa() {

  }
}
