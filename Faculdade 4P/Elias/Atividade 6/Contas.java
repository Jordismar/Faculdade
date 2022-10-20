public class Contas {
    protected float saldo;
    protected float saldoAnterior;
    protected float taxaServico;

    public Contas(float taxaServico) {
        this.saldo = 0;
        this.taxaServico = taxaServico;
    }

    protected void render() {
        System.out.println("Permitido somente para Contas Poupança.");
    }

    protected float depositar(float valor) {
        this.saldoAnterior = this.saldo;
        this.saldo = valor;
        return valor;
    }

    protected float sacar(float valor) {
        this.saldoAnterior = this.saldo;
        if (valor > this.saldo) {
            System.out.println("Saldo Insuficiente.");
            return 0;
        }

        this.saldo -= valor;

        return valor;
    }

    protected void transferir(float valor, Contas conta) {
        float tranferencia;
        this.saldoAnterior = this.saldo;
        tranferencia = this.sacar(valor);

        if (tranferencia == 0) {
            System.out.println("Erro na transferencia.");
            return;
        }

        conta.depositar(tranferencia);
        System.out.println("Transferencia Concluida-> Valor " + tranferencia);
    }

    protected float getSaldo() {
        return this.saldo;
    }

    protected float getSaldoAnterior() {
        return this.saldoAnterior;
    }
}