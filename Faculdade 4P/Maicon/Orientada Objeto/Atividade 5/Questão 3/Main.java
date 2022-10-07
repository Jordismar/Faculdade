import java.util.*;

public class Main {
    public static void main(String[] args) {
        Alternativa auxiliar = new Alternativa();
        Scanner entrada = new Scanner(System.in);
        HashMap<Integer, Alternativa> exercicio = new HashMap<Integer, Alternativa>();
        int op = 0;
        int i = 0;

        do {
            System.out.print("\n");
            System.out.println("1-Cadastrar exercicio");
            System.out.println("2-Exibir exercicios");
            System.out.println("0-Sair");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.print("\n");
            switch (op) {
                case 1:
                    auxiliar.inserirEnunciado();
                    auxiliar.cadastrarAlternativas();
                    exercicio.put(i++, auxiliar);
                    System.out.print("\n");
                    break;

                case 2:

                    for (Alternativa a : exercicio.values()) {
                        a.mostrarEnunAlter();
                        System.out.print("\n");
                    }
                    break;

                default:
                    System.out.print("\nSelecione Corretamente\n");
                    break;
            }
        } while (op != 0);
    }
}