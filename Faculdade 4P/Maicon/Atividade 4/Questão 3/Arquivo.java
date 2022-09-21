public class Arquivo {
    private String painel;
    
    
    
    public Arquivo(){
        painel = "A vó do nelson come nuggets";
    }
    public String getPainel() {
        return painel;
    }

    public void setPainel(String painel) {
        this.painel = painel;
    }
    
    public void gerenciar(){
        System.out.println(painel);

    }
}
