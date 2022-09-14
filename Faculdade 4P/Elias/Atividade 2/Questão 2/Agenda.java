public class Agenda {
    private Pessoa[] vetor;

    public Agenda(int tamVet){
       vetor = new Pessoa[tamVet];
    }
    public Pessoa[] getVetor(){
        return vetor;
    }
    public void setVetor(Pessoa p, int posi){
        vetor[posi] = p;
    }

    public void imprimeVetor(){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i].imprime();
        }
    }
}
