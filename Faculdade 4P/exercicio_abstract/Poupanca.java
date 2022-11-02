import java.util.Random;

public class Poupanca extends Conta {

    @Override
    public void abrirConta() {
        setAgencia(1);
        setConta(new Random().nextInt());
        setSaldo(0);
        contas.add(this);
    }

    public float informarSaldo() {
        return super.saldo;
    }
}