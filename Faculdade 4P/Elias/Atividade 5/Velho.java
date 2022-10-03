public class Velho extends Imovel {
    private float desconto;

    public Velho() {
        super();
        this.desconto = 0;
    }

    public float getDesconto() {
        return desconto;
    }

    public void calcula(float valor) {
        this.desconto = (float) (valor - (valor * 0.1));
    }
}
