public class Agenda {
  public Pessoa[] p;

  public Agenda(int quant) {
    this.p = new Pessoa[quant];

  }

  public void newPessoa(int quant) {
    this.p[quant].cadastraPessoa();
  }
}
