import java.util.HashMap;

public class Banco {
    private int nConta;
    private Contas conta;
    private Contas conta2;
    private float valor;
    private HashMap<Integer, Contas> banco = new HashMap<Integer, Contas>();

    public Banco() {
        this.nConta = 1;
    }

    public int criarConta(Contas conta) {
        int aux = this.nConta;

        banco.put(nConta, conta);

        this.nConta += 1;

        return aux;
    }

    public void saldoConta(int nConta) {
        conta = banco.get(nConta);
        System.out.println("Seu saldo-> " + conta.getSaldo());
    }

    public void transferir(int nConta, float valor, int nContaTransferencia) {
        conta = banco.get(nConta);
        conta2 = banco.get(nContaTransferencia);
        conta.transferir(valor, conta2);
        banco.put(nConta, conta);
        banco.put(nContaTransferencia, conta2);
    }

    public void sacar(int nConta, float valor) {
        conta = banco.get(nConta);
        this.valor = conta.sacar(valor);
        banco.put(nConta, conta);
        System.out.println("Valor de saque-> " + this.valor);
    }

    public void depositar(int nConta, float valor) {
        conta = banco.get(nConta);
        this.valor = conta.depositar(valor);
        banco.put(nConta, conta);
        System.out.println("Valor de deposito-> " + this.valor);
    }

    public void render(int nConta) {
        conta = banco.get(nConta);
        conta.render();
        banco.put(nConta, conta);
    }

    public void exibirSaldoContas() {
        for (int nConta : banco.keySet()) {
            System.out.println("Conta-> " + nConta);
            System.out.println("Saldo Anterior-> " + banco.get(nConta).getSaldoAnterior());
            System.out.println("Saldo Atual-> " + banco.get(nConta).getSaldo());
        }
    }
}