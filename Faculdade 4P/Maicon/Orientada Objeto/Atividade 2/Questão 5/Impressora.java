import java.util.Scanner;
public class Impressora {
    public String marca [] = new String [5];
    public String modelo [] = new String [5];
    public int ano [] = new int [5];
    public String frasePImprimir [] = new String [5];
    public int qtdPMinuto [] = new int [5];
    
    Scanner entrada = new Scanner(System.in);

    public Impressora(){
      for (int i = 0; i < 5; i++) {
        this.marca [i] = "";
        this.modelo [i] = "";
        this.ano [i] = 0;
        this.frasePImprimir [i] = "";
        this.qtdPMinuto [i] = 0;
      }
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }}
    public void preencheImpressora(int imp){
        System.out.println("Preenchendo os dados do Impressora\n");
        System.out.print("Informe a Marca da Impressora -> ");
        this.marca[imp] = entrada.nextLine();
        
        System.out.print("Informe o Modelo da Impressora -> ");
        clearBuffer(entrada);
        this.modelo[imp] = entrada.nextLine();

        System.out.print("Informe o Ano de lançamento da Impressora -> ");
        this.ano[imp] = entrada.nextInt();
    
        System.out.print("Informe quantos paginas por min a Impressora -> ");
        this.qtdPMinuto[imp] = entrada.nextInt();
    
        System.out.println("===========================================================\n");
      }
      public void exibeImpressora(int imp){
        System.out.println("Marca -> " + this.marca[imp]);
        System.out.println("Modelo -> " + this.modelo[imp] );
        System.out.println("Ano -> " + this.ano[imp] );
        System.out.println("Quantidade de Paginas por Minuto -> " + this.qtdPMinuto[imp] );
        System.out.println("===========================================================\n");
      }
      public void fraseImpressora(int imp){
        System.out.print("Informe a frase para Salvar -> ");
        clearBuffer(entrada);
        this.frasePImprimir[imp] = entrada.nextLine();
      }
      public void imprimir(int imp){
        System.out.println("|-----------------------------|");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|      Congratulation         |");
        System.out.println("|        "+frasePImprimir[imp]+"              |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|-----------------------------|");

        System.out.println("===========================================================\n");
      }
}
