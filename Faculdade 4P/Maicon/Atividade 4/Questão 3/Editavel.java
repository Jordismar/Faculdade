import java.util.Scanner;

public class Editavel extends Arquivo{ 
    Scanner entrada = new Scanner(System.in);
    public String aux;
    public Editavel(){
        super();
    }
    
    public void gerenciar(){
        System.out.println("Editando -> ");
        this.aux = entrada.nextLine();
        super.setPainel(this.aux);
    }
}
