import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente contaCorrente;
        ContaPoupanca contaPoupanca;
        Banco banco = new Banco();
        int op;
        int taxaServico;
        int nConta;
        int nContaTransferencia;
        int aux;

        System.out.println("Informe a taxa de serviço");
        taxaServico = entrada.nextInt();

        do {
            System.out.println("1- Cadastrar Conta Corrente");
            System.out.println("2- Cadastrar Conta Poupança");
            System.out.println("3- Utilizar Conta Corrente");
            System.out.println("4- Utilizar Conta Poupança");
            System.out.println("5- Exibir saldo das contas");
            System.out.println("0- Sair");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    contaCorrente = new ContaCorrente(taxaServico);
                    nConta = banco.criarConta(contaCorrente);
                    System.out.println("Conta Corrente de numero " + nConta + " foi criada!");
                    break;
                case 2:
                    contaPoupanca = new ContaPoupanca(taxaServico);
                    nConta = banco.criarConta(contaPoupanca);
                    System.out.println("Conta Poupança de numero " + nConta + " foi criada!");
                    break;
                case 3:
                    System.out.println("Informe o numero da Conta Corrente");
                    nConta = entrada.nextInt();
                    do {
                        System.out.println("1- Sacar");
                        System.out.println("2- Transferir");
                        System.out.println("3- Exibir saldo");
                        System.out.println("4- Depositar");
                        System.out.println("0- Sair");
                        op = entrada.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Informe o valor que deseja sacar.");
                                aux = entrada.nextInt();
                                banco.sacar(nConta, aux);
                                break;
                            case 2:
                                System.out.println("Informe o valor que deseja transferir.");
                                aux = entrada.nextInt();
                                System.out.println("Informe o numero da conta");
                                nContaTransferencia = entrada.nextInt();
                                banco.transferir(nConta, aux, nContaTransferencia);
                                break;
                            case 3:
                                banco.saldoConta(nConta);
                                break;
                            case 4:
                                System.out.println("Informe o valor que deseja depositar.");
                                aux = entrada.nextInt();
                                banco.depositar(nConta, aux);
                                break;
                        }
                    } while (op != 0);
                    op = 1;
                    break;
                case 4:
                    System.out.println("Informe o numero da Conta Poupança");
                    nConta = entrada.nextInt();
                    do {
                        System.out.println("1- Sacar");
                        System.out.println("2- Transferir");
                        System.out.println("3- Exibir saldo");
                        System.out.println("4- Render");
                        System.out.println("5- Depositar");
                        System.out.println("0- Sair");
                        op = entrada.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Informe o valor que deseja sacar.");
                                aux = entrada.nextInt();
                                banco.sacar(nConta, aux);
                                break;
                            case 2:
                                System.out.println("Informe o valor que deseja transferir.");
                                aux = entrada.nextInt();
                                System.out.println("Informe o numero da conta");
                                nContaTransferencia = entrada.nextInt();
                                banco.transferir(nConta, aux, nContaTransferencia);
                                break;
                            case 3:
                                banco.saldoConta(nConta);
                                break;
                            case 4:
                                banco.render(nConta);
                                break;
                            case 5:
                                System.out.println("Informe o valor que deseja depositar.");
                                aux = entrada.nextInt();
                                banco.depositar(nConta, aux);
                                break;
                        }
                    } while (op != 0);
                    op = 1;
                    break;
                case 5:
                    banco.exibirSaldoContas();
                    break;
            }
        } while (op != 0);

        entrada.close();
    }

}