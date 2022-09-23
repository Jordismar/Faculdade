import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        Pessoa p;
        int tamVet = 10;
        Agenda a = new Agenda(tamVet);
        do {
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Exibir agenda");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            int i = 0;
            switch (op) {
                case 1:
                    System.out.print("Nome-> ");
                    p.setNome(entrada.nextLine());
                    System.out.print("Idade-> ");
                    p.setIdade(entrada.nextInt());
                    System.out.print("Altura-> ");
                    p.setAltura(entrada.nextFloat());
                    a.armazeaPessoa(i);
                    i++;
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Selecione Corretamente\n");
                    break;
            }
        } while (op != 0);
    }
}
