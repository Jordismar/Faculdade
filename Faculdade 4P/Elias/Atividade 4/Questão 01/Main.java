import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa2 p;
        int tamVet = 20;
        VetContato vet = new VetContato(tamVet);
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("So podera cadastrar ate 20 pessoas");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Exibir lista de Pessoas");
            System.out.println("0- Sair \n");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();
            entrada.nextLine();
            int i = 0;

            switch (op) {
                case 1:
                    p = new Pessoa2();
                    System.out.print("Nome ->");
                    p.setNome(entrada.nextLine());
                    System.out.print("Data de Nascimento ->");
                    p.setDia(entrada.nextInt());
                    System.out.print("/");
                    p.setMes(entrada.nextInt());
                    System.out.print("/");
                    p.setAno(entrada.nextInt());
                    System.out.print("Altura ->");
                    p.setAltura(entrada.nextFloat());
                    vet.setVetor(p, i);
                    i++;
                    System.out.print("\n");
                    break;
                case 2:
                    vet.imprimindo();
                    break;

                default:
                    System.out.println("\nSelecione corretamente");
                    break;
            }
        } while (op != 0);
    }
}
