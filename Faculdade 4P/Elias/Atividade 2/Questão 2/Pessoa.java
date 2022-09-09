import java.util.Scanner;

public class Pessoa {
  public String nome;
  public int idade;
  public boolean cadastrada;
  public Scanner entrada = new Scanner(System.in);

  public Pessoa() {
    this.nome = "";
    this.idade = 0;
    this.cadastrada = false;
  }

  public void cadastraPessoa() {
    System.out.println("Nova pessoa:");
    System.out.println("\n");
    System.out.print("Nome -> ");
    this.nome = entrada.nextLine();
    System.out.print("Idade -> ");
    this.idade = entrada.nextInt();
    this.cadastrada = true;
  }

  public void exibePessoa(int quant) {

  }
}
