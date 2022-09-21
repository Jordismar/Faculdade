public class Cachorro {
    protected String temperamento;
    protected String olfato;
    protected String tamanho;
    protected String nome;

    public Cachorro() {
        temperamento = "";
        olfato = "";
        tamanho = "";
        nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String getOlfato() {
        return olfato;
    }

    public void setOlfato(String olfato) {
        this.olfato = olfato;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void latir() {
        System.out.println("Ao ao");
    }

    public void brincar() {
        System.out.println("Buscar graveto");
    }

}
