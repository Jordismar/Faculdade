import java.util.*;

public class Alternativa {
    private String enunciado;
    private ArrayList<String> alternativas;
    private Scanner scan;

    public Alternativa() {
        this.enunciado = new String();
        this.enunciado = "";
        this.alternativas = new ArrayList<String>();
        this.scan = new Scanner(System.in);
    }

    public void inserirEnunciado() {
        System.out.print("\nDigite o enunciado da questao:");
        this.enunciado = scan.nextLine();
    }

    public void cadastrarAlternativas() {
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + " alternativa:");
            alternativas.add(scan.nextLine());
        }
    }

    public void mostrarEnunAlter() {
        System.out.print("\n\nEnunciado: " + this.enunciado);

        for (int i = 0; i < 4; i++) {
            System.out.print("\n\t" + (i + 1) + ") " + alternativas.get(i));
        }
    }
}
