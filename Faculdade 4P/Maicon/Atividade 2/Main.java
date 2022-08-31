public class Main {
  public static void main(String[] args) {
    Gabinete pika = new Gabinete(10);
    Gabinete pikadasgalaxia = new Gabinete(50);

    System.out.println("botoes do pika " + pika.botoes);
    System.out.println("botoes do pika das galaxia " + pikadasgalaxia.botoes);
    pika.ligarComputador();
  }
}
