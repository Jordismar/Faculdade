public class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    
    public Veiculo(){
        cor = "";
        marca = "";
        modelo = "";
        ano = 0;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void locomover(){
        System.out.println("Ligar e andar");

    }
}
