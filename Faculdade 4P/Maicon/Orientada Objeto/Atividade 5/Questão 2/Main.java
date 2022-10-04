import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        HashSet<String> musica = new HashSet<String>();
        do {
            System.out.print("\n");
            System.out.println("1- Inserir Música");
            System.out.println("2- Ver Primeira Música");
            System.out.println("3- Remover a primeira Música");
            System.out.println("4- Imprimir lista completa de Músicas");
            System.out.println("0- Sair");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.print("\n");

            switch (op) {
                case 1:
                    System.out.print("Informe o nome da musica-> ");
                    musica.add(entrada.nextLine());
                    break;
                case 2:
                    System.out.println("A primeira musica é " + musica.get(0));
                    break;
                case 3:
                    System.out.println("Removendo a musica " + musica.get(0));
                    musica.remove(args)
                    break;
                case 4:
                    for (String string : musica) {
                        System.out.println("Musica -> "+ string);
                    }
                    break;

                default:
                    System.out.print("\n");
                    System.out.println("Seleione Corretamente");
                    System.out.print("\n");
                    break;
            }
        } while (op != 0);
    }
}
