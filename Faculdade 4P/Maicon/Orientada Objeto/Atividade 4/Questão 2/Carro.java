public class Carro extends Veiculo{ 
    private int cavalos;
    public Carro(){
        super();
        cavalos = 0;
    }
    public int getCavalos() {
        return cavalos;
    }
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
    public void locomover(){
        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|     vruuuuuuuuuuuu          |");
        System.out.println("|     vruuuuuuuuuuuu          |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");
    }
 
}
