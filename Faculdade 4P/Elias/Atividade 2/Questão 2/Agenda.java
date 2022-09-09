public class Agenda {
  public int posicao = 0;
  public Pessoa[] p = new Pessoa[30];
  public Agenda() {
    
  }
  
  public void newPessoa() {
    System.out.println("teste");
    p[this.posicao].cadastraPessoa();
    this.posicao++;
  }
}
