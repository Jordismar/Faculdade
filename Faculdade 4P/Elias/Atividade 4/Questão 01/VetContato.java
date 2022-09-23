import java.util.Scanner;

public class VetContato {

    private Scanner entrada = new Scanner(System.in);
    private Pessoa[] vetor;

    
    public VetContato(int tamVet){
        vetor = new Pessoa[tamVet];
    }
    public Pessoa[] getVetor() {
        return vetor;
    }

    public void setVetor(Pessoa[] vetor) {
        this.vetor = vetor;
    }
    public void calculaIdade(int i){
        int anoAtual = 0;
        int aux = 0;
        System.out.print("Em que ano esta? ");
        anoAtual = entrada.nextInt();
        aux = anoAtual - vetor[i].getAno();
        vetor[i].setIdade(aux);
    }
    public void imprimindo(){
        for (int i = 0; i < vetor.length; i++) {
            calculaIdade(i);
            System.out.print("Nome -> "+ vetor[i].getNome());
            System.out.println("Idade ->"+ vetor[i].getIdade());
            System.out.print("Data de Nascimento -> "+vetor[i].getDia()+"/"+vetor[i].getMes()+"/"+vetor[i].getAno());
            System.out.print("Altura -> "+vetor[i].getAltura());
            System.out.print("\n");
        }
    }
}
