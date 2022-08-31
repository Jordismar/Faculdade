public class Gabinete {
  public int botoes;

  public Gabinete(int botoes) {
    this.botoes = botoes;
    System.out.println("chamei o construtor do gabinete!!!");
  }

  public void ligarComputador() {
   Monitor odyssey = new Monitor();

   odyssey.ligar();
  }
}
