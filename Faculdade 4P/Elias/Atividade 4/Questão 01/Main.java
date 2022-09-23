import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p;
        int tamVet = 1;
        VetContato vet = new VetContato(tamVet);
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Exibir lista de Pessoas");
            System.out.println("0- Sair \n");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    p = new Pessoa();
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
                    tamVet++;
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
