public class app {

    public static void main(String[] args) {

        Conta contaC = new Corrente();
        Conta contaP = new Poupanca();

        contaC.setSaldo(0);
        System.out.println(contaC.getSaldo());
        contaC.abrirConta();
        System.out.println(contaC.getSaldo());

        contaP.setSaldo(0);
        System.out.println(contaP.getSaldo());
        contaP.abrirConta();
        System.out.println(contaP.getSaldo());

        // contaC.deposito(100);

        exibirSaldo(contaC);
        exibirSaldo(contaP);
    }

    public static void exibirSaldo(Conta conta) {
        System.out.println("Agencia " + conta.getAgencia());
        System.out.println("Saldo " + conta.informarSaldo());
    }

}