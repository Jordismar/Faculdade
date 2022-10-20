public class ContaPoupanca extends Contas {
    private int movi;

    public ContaPoupanca(float taxaServico) {
        super(taxaServico);
        this.movi = 0;
    }

    public void transferir(float valor, Contas conta) {
        super.saldoAnterior = super.saldo;
        float tranferencia;

        tranferencia = this.sacar(valor);

        conta.depositar(tranferencia);

        System.out.println("Transferencia Concluida-> Valor " + tranferencia);
    }

    public void render() {
        super.saldoAnterior = super.saldo;
        super.saldo = super.saldo + (super.saldo * 0.007F);
    }

    private void cobrarTaxaServico() {

        super.saldo = super.saldo - (super.taxaServico / 2);

        if (super.saldo <= 0) {
            super.saldo = 0;
            System.out.println("Saldo zerado.");
        }
    }

    public float sacar(float valor) {
        super.saldoAnterior = super.saldo;

        if (valor > this.saldo) {
            System.out.println("Saldo Insuficiente.");

            return 0;
        }

        super.saldo -= valor;

        if (this.movi > 5) {
            this.cobrarTaxaServico();
        }
        this.movi += 1;
        return valor;
    }

}