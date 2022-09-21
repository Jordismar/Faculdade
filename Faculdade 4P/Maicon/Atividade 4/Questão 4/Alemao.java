public class Alemao extends Cachorro {

    public Alemao() {
        super();
        super.temperamento = "Raivoso";
        super.olfato = "Good";
        super.tamanho = "Grande";
    }

    public void latir() {
        System.out.println("AuAu");
    }

    public void brincar() {
        System.out.println("Destruindo brinquedo");
    }

    public void cacar() {
        System.out.println("Pegando pato");
    }

    public void morder() {
        System.out.println("Mordendo sua perna");
    }

    public void farejarDrogas() {
        System.out.println("Procurando Drogas");
    }
}
