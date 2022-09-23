import java.util.Scanner;
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public int cavalos;
    public int tamTank;

    Scanner entrada = new Scanner(System.in);

    public Carro(){
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.cavalos = 0;
        this.tamTank = 0;
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }}
    public void preencheCarro(){
        System.out.println("Preenchendo os dados do Carro\n");
        System.out.print("Informe a Marca da Carro -> ");
        this.marca = entrada.nextLine();
    
        System.out.print("Informe o Modelo da Carro -> ");
        clearBuffer(entrada);
        this.modelo = entrada.nextLine();

        System.out.print("Informe o Ano da Carro -> ");
        this.ano = entrada.nextInt();
    
    
        System.out.print("Informe quantas Cavalos da Carro -> ");
        this.cavalos = entrada.nextInt();
    
        System.out.print("Informe quantos Litros cabe nesta Carro -> ");
        this.tamTank = entrada.nextInt();
    
        System.out.println("===========================================================\n");
      }
      public void exibeCarro(){
        System.out.println("Marca -> " + this.marca);
        System.out.println("Modelo -> " + this.modelo );
        System.out.println("Ano -> " + this.ano );
        System.out.println("Cavalos -> " + this.cavalos );
        System.out.println("Tamanho do Tanque -> " + this.tamTank );
        System.out.println("===========================================================\n");
      }
}
