import java.util.HashMap;

public class Contas {
    private float saldo;

    public Contas() {
        saldo = 0;
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
