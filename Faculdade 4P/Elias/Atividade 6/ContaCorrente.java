public class ContaCorrente extends Contas {
    private float chequeEspecial;

    public ContaCorrente(float taxaServico) {
        super(taxaServico);
        this.chequeEspecial = 0;
    }

    private void cobrarTaxaServico() {

        if (super.taxaServico > super.saldo) {
            this.cobrarCequeEspecial(this.taxaServico);
        }

        super.saldo -= super.taxaServico;
    }

    private void cobrarCequeEspecial(float valor) {
        float valorTaxa;

        valorTaxa = valor - super.saldo;
        valorTaxa = valorTaxa + (valorTaxa * 0.8F);
        this.chequeEspecial += valorTaxa;
        super.saldo = 0;
    }

    public float sacar(float valor) {
        super.saldoAnterior = super.saldo;

        if (valor > super.saldo) {
            this.cobrarCequeEspecial(valor);
            return valor;
        }

        super.saldo -= valor;

        this.cobrarTaxaServico();
        return valor;
    }

    public void transferir(float valor, HPConta conta) {
        float tranferencia;

        super.saldoAnterior = super.saldo;

        tranferencia = this.sacar(valor);

        conta.depositar(tranferencia);

        System.out.println("Transferencia Concluida-> Valor " + tranferencia);
    }
}