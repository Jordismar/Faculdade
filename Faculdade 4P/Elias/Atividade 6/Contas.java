import java.util.HashMap;

public class Contas {
    private float saldo;
    private int nConta = 0;
    private HashMap<Integer, ContaCorrente> contaCorrente;
    private HashMap<Integer, ContaPoupanca> contaPoupanca;

    public Contas() {
        saldo = 0;
        nConta++;
        contaCorrente = new HashMap<Integer, ContaCorrente>();
        contaPoupanca = new HashMap<Integer, ContaPoupanca>();
    }

    public int getnConta() {
        return nConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Deposito(float deposito, int nConta) {

        this.saldo = this.saldo + deposito;
        System.out.println(this.saldo);
    }

    public void Sacar(float requisitado) {
        this.saldo = this.saldo - requisitado;
        System.out.println(this.saldo);
    }

}
