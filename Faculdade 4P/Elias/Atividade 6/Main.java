import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Banco b = new Banco();
        Contas contas;
        int aux = 0;

        do {
            System.out.println("1- Cadastrar Conta Corrente");
            System.out.println("2- Cadastrar Conta Poupança");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Visualizar Saldo");
            System.out.println("0- Sair");
            System.out.print("Informe -> ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    contas = new Contas();
                    System.out.print("Sua conta é -> " + contas.getnConta());
                    System.out.println("Saldo -> " + contas.getSaldo());
                    break;
                case 2:

                    break;
                case 3:
                    System.out.print("Informe o numero da conta-> ");
                    aux = entrada.nextInt();
                    System.out.print("Informe o valor do deposito-> ");
                    contas.Deposito(entrada.nextFloat(), aux);
                    break;
                case 4:
                    System.out.print("Informe o valor para sacar-> ");
                    contas.Sacar(entrada.nextFloat());
                    break;
                case 5:
                    System.out.println("Saldo atual de " + contas.getSaldo());
                    break;

                default:
                    System.out.println("Informe corretamente");
                    break;
            }
        } while (op != 0);
    }
}
