public class Agenda {
    private Pessoa2[] vetor;

    public Agenda(int tamVet){
       vetor = new Pessoa2[tamVet];
    }
    public Pessoa2[] getVetor(){
        return vetor;
    }
    public void setVetor(Pessoa2 p, int posi){
        vetor[posi] = p;
    }

    public void imprimeVetor(){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i].imprime();
        }
    }
}
