public class PastorAlemao extends Animais {
    public PastorAlemao() {
        super();
        super.setTemperamento("Agitado");
        super.setOlfato("Otimo");
        super.setTamanho("Grande");
    }

    public void caçar() {
        System.out.println("Caçando!");
    }
    public void morder() {
        System.out.println("Mordendo!");
    }
    public void farejar() {
        System.out.println("Farejando...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Encontrou drogras!");
    }
}