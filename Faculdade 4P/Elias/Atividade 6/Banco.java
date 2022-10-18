import java.util.HashMap;

public class Banco {
    private Contas contas;
    private HashMap<Integer, Contas> cont;
    private int nConta;

    
    public Banco() {
        cont = new HashMap<Integer, Contas>();
        nConta = 0;
    }
    
    public int novaConta(Contas conta) {
        nConta++;
        cont.put(nConta, conta);
        return nConta;
    }
    
    public int getnConta() {
        return nConta;
    }

    public float saldo(int nConta){
        contas = cont.get(nConta);
        return contas.getSaldo();

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
