public class Novo extends Imovel {
    private float acrescimo;

    public Novo() {
        super();
        this.acrescimo = 0;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void calcula(float valor) {
        this.acrescimo = (float) (valor + (valor * 0.1));
    }
}
