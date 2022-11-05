import java.util.ArrayList;
import java.util.Random;

public class Corrente extends Conta {
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    private float aux = 0;

    public void abrirConta() {
        Conta contaC = new Corrente();
        System.out.println("\n");
        contaC.setAgencia(1);
        contaC.setConta(new Random().nextInt(9999));
        contaC.setSaldo(0);
        System.out.println("Conta-> " + contaC.getConta());
        System.out.println("Agencia-> " + contaC.getAgencia());
        System.out.println("Saldo-> " + contaC.getSaldo());
        System.out.println("\n");
        contas.add(contaC);
    }

    public void setSaldo(float saldo) {
        super.saldo = saldo;
    }

    public float exibirSaldo(int nConta) {
        Conta contaC = new Corrente();
        for (int i = 0; i < contas.size(); i++) {
            contaC = contas.get(i);
            if (nConta == contaC.getConta()) {
                return contaC.getSaldo();
            }

        }
        return 0;
    }

    public void exibirSaldoTodos() {
        Conta contaC = new Corrente();
        aux = 0;
        for (int i = 0; i < contas.size(); i++) {
            contaC = contas.get(i);
            aux += contaC.getSaldo();
        }
        System.out.println("Saldo total-> " + aux);
    }

    public void exibirContas() {
        Conta contaC = new Corrente();
        for (int i = 0; i < contas.size(); i++) {
            contaC = contas.get(i);
            System.out.println("=========================");
            System.out.println("Conta-> " + contaC.getConta());
            System.out.println("Agencia-> " + contaC.getAgencia());
            System.out.println("Saldo-> " + contaC.getSaldo());

        }
        System.out.println("\n");
    }

    public void deposito(float valor, int nConta) {
        Conta contaC = new Corrente();
        aux = 0;
        for (int i = 0; i < contas.size(); i++) {
            contaC = contas.get(i);
            if (nConta == contaC.getConta()) {
                aux = contaC.getSaldo() + valor;
                contaC.setSaldo(aux);
                contas.set(i, contaC);
                break;
            }

        }
    }

    public void sacar(float valor, int nConta) {
        Conta contaC = new Corrente();
        aux = 0;
        for (int i = 0; i < contas.size(); i++) {
            contaC = contas.get(i);
            if (nConta == contaC.getConta()) {
                aux = contaC.getSaldo() - valor;
                if (aux < 0) {
                    System.out.println("Saldo Insuficiente");
                } else {
                    contaC.setSaldo(aux);
                    contas.set(i, contaC);
                    break;
                }
            }

        }
    }
}