public abstract class Conta {

    private int conta;
    private int agencia;
    protected float saldo;

    public abstract void abrirConta();

    public abstract float informarSaldo();

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo + 50;
    }
}