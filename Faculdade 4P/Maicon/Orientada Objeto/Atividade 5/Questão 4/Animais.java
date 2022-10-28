public class Animais {
    protected String temperamento;
    protected String olfato;
    protected String tamanho;

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

    public void brincar() {
        System.out.println("Brincando!!!");
    }

    public void latir() {
        System.out.println("Uau ");
        System.out.println("Uau Uau");
        System.out.println("Uau Uau");
        System.out.println("UauUau");
        System.out.println("Uau");
    }
}