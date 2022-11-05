import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int op = 0;
        int opS = 0;
        float aux = 0;
        Corrente auxCorrente = new Corrente();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("1- Criar Conta");
            System.out.println("2- Exibir Contas");
            System.out.println("3- Exibir saldo de uma conta");
            System.out.println("4- Exibir saldo de todas contas");
            System.out.println("5- Manipular Saldo");
            System.out.println("0- Sair");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    auxCorrente.abrirConta();
                    break;
                case 2:
                    auxCorrente.exibirContas();
                    break;
                case 3:
                    System.out.print("Informe o numero da conta-> ");
                    aux = auxCorrente.exibirSaldo(entrada.nextInt());
                    System.out.println("Saldo-> " + aux);
                    break;
                case 4:
                    auxCorrente.exibirSaldoTodos();
                    break;
                case 5:
                    int nConta = 0;
                    System.out.print("Informe o numero da conta-> ");
                    nConta = entrada.nextInt();
                    do {
                        System.out.println("==================");
                        System.out.println("Conta-> " + nConta);
                        System.out.println("1- Depositar");
                        System.out.println("2- Sacar");
                        System.out.println("0- Sair");
                        System.out.print("Selecione-> ");
                        opS = entrada.nextInt();

                        switch (opS) {
                            case 1:
                                System.out.print("Informe o valor de Deposito-> ");
                                aux = entrada.nextFloat();
                                auxCorrente.deposito(aux, nConta);
                                break;
                            case 2:
                                System.out.print("Informe o valor que deseja Sacar-> ");
                                aux = entrada.nextFloat();
                                auxCorrente.deposito(aux, nConta);
                                break;

                            default:
                                System.out.println("Selecione Corretamente");
                                break;
                        }
                    } while (opS != 0);
                    break;
                default:
                    System.out.println("Selecione corretamente");
                    break;
            }
        } while (op != 0);
    }
}