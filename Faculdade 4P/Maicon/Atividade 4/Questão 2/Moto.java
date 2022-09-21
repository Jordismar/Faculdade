public class Moto extends Veiculo{
    private int cilindradas; 
    
    
    public Moto(){
        super();
        cilindradas = 0;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void locomover(){
        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|     vroooooooooooo          |");
        System.out.println("|     vroooooooooooo          |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");
    }
}
