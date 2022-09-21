import java.util.Scanner;

public class Poodle extends Cachorro{ 
    Scanner entrada = new Scanner(System.in);
    public String aux;
    public Poodle(){
        super();
    }
    
    public void gerenciar(){
        System.out.println("Editando -> ");
        this.aux = entrada.nextLine();
        super.setPainel(this.aux);
    }
}
