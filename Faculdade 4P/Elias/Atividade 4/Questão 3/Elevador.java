public class Elevador {
    private int andar;
    private int quantPessoa;
    private int lota;
    private int quantAndares;

    public Elevador() {
        this.andar = 0;
        this.quantPessoa = 0;
        this.lota = 10;
        this.quantAndares = 10;
    }

    public int getLota() {
        return lota;
    }

    public int getQuantAndares() {
        return quantAndares;
    }

    public int getAndar() {
        return andar;
    }

    public void aumentarAndar() {
        this.andar++;
    }

    public void diminuiAndar() {
        this.andar--;
    }

    public int getQuantPessoa() {
        return quantPessoa;
    }

    public void aumentarQuantPessoa() {
        this.quantPessoa++;
    }

    public void diminuiQuantPessoa() {
        this.quantPessoa--;
    }
}
