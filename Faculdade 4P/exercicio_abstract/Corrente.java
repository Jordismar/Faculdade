import java.util.Random;

public class Corrente extends Conta {

    @Override
    public void abrirConta() {
        setAgencia(2);
        setConta(new Random().nextInt());
        super.setSaldo(0);
        contas.add(this);
    }

    public void setSaldo(float saldo) {
        super.saldo = saldo;
    }

    public float informarSaldo() {
        return super.saldo;
    }

    public void deposito(float valor) {
        super.saldo += valor;
    }
}