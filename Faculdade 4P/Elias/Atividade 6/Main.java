import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Banco b = new Banco();
        Contas contas;
        int nConta = 0;
        ContaCorrente contaCorrente;
        ContaPoupanca contaPoupanca;
        int aux = 0;

        do {
            System.out.println("1- Cadastrar Conta Corrente");
            System.out.println("2- Cadastrar Conta Poupança");
            System.out.println("3- Entrar na conta");
            System.out.println("0- Sair");
            op = entrada.nextInt();

            switch (op) {

                case 1:
                    contaCorrente = new ContaCorrente();
                    nConta = b.novaConta(contaCorrente);
                    System.out.print("Sua conta é -> " + b.getnConta());
                    System.out.println("Saldo -> " + b.saldo(nConta));
                    break;
                
                case 2:
                    contaPoupanca = new ContaPoupanca();
                    nConta = b.novaConta(contaPoupanca);
                    System.out.print("Sua conta é -> " + b.getnConta());
                    System.out.println("Saldo -> " + b.saldo(nConta));
                    break;
                
                case 3:
                    System.out.print("Informe o numero da sua conta-> ");
                    nConta = entrada.nextInt();
                    System.out.println("\n");
                    System.out.println("=========================\n\n");
                        do {
                            
                            System.out.println("1- Depositar");
                            System.out.println("2- Sacar");
                            System.out.println("3- Visualizar Saldo");
                            System.out.println("0- Sair");
                            System.out.print("Informe -> ");
                            op = entrada.nextInt();
                            entrada.nextLine();
                            switch (op) {   
                                
                                case 1:
                                System.out.print("Informe o valor do deposito-> ");
                                contas.Deposito(entrada.nextFloat(), nConta);
                                break;
                                case 2:
                                System.out.print("Informe o valor para sacar-> ");
                                contas.Sacar(entrada.nextFloat());
                                break;
                                case 3:
                                System.out.println("Saldo atual de " + contas.getSaldo());
                                break;
                                
                                default:
                                System.out.println("Informe corretamente");
                                break;
                            }
                        } while (op != 0);
                    break;
            
                default:
                        System.out.println("Informe corretamente");
                    break;
            }

        } while (op != 0);
    }
}
