import java.util.Scanner;
public class Motocicleta {
    public String marca;
    public String modelo;
    public int ano;
    public int cilindradas;
    public int tamTank;

    Scanner entrada = new Scanner(System.in);

    public Motocicleta(){
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.cilindradas = 0;
        this.tamTank = 0;
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }}
    public void preencheMotocicleta(){
        System.out.println("Preenchendo os dados do Motocicleta\n");
        System.out.print("Informe a Marca da Motocicleta -> ");
        this.marca = entrada.nextLine();
    
        System.out.print("Informe o Modelo da Motocicleta -> ");
        clearBuffer(entrada);
        this.modelo = entrada.nextLine();

        System.out.print("Informe o Ano da Motocicleta -> ");
        this.ano = entrada.nextInt();
    
    
        System.out.print("Informe quantas Cilidradas da Motocicleta -> ");
        this.cilindradas = entrada.nextInt();
    
        System.out.print("Informe quantos Litros cabe nesta Motocicleta -> ");
        this.tamTank = entrada.nextInt();
    
    
      }
      public void exibeMotocicleta(){
        System.out.println("Marca -> " + this.marca);
        System.out.println("Modelo -> " + this.modelo );
        System.out.println("Ano -> " + this.ano );
        System.out.println("Cilindradas -> " + this.cilindradas );
        System.out.println("Tamanho do Tanque -> " + this.tamTank );
      }
      public void vrum(){
        System.out.println("|-----------------------------|");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|      Congratulation         |");
        System.out.println("|        vrummmm              |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|-----------------------------|");
      }
}
