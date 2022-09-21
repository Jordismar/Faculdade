import java.util.Scanner;

public class Poodle extends Cachorro {
    Scanner entrada = new Scanner(System.in);
    public String aux;

    public Poodle() {
        super();
        super.temperamento = "Docil";
        super.olfato = "Very Good";
        super.tamanho = "Pequeno";
    }

    public void latir() {
        System.out.println("auuuuuuu uu u ");
    }

    public void brincar() {
        System.out.println("pegando bolinha ");
    }

    public void saltar() {
        System.out.println("pulando de um lado para o outro");
    }

    public void rolar() {
        System.out.println("rolando rolando ");
    }

    public void esconder() {
        System.out.println("escondendo atras da planta");
    }
}
