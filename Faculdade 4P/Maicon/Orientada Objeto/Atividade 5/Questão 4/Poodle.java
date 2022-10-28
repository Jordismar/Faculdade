public class Poodle extends Animais{
    
    public Poodle(String tamanho) {
        super();
        super.setTemperamento("Docil");
        super.setOlfato("Bom");
        super.setTamanho(tamanho);
    }

    public void saltar() {
        System.out.println("Saltando!");
    }
    public void rolar() {
        System.out.println("rolando!");
    }
    public void esconder() {
        System.out.println("Escondendo!");
    }
}