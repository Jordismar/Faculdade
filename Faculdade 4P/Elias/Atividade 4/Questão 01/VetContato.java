import java.util.Scanner;

public class VetContato {

    private Scanner entrada = new Scanner(System.in);
    public Pessoa2[] vetor;

    public VetContato(int tamVet) {
        vetor = new Pessoa2[tamVet];
    }

    public Pessoa2[] getVetor() {
        return vetor;
    }

    public void setVetor(Pessoa2 pessoa, int posicao) {
        this.vetor[posicao] = pessoa;
    }

    public void calculaIdade(int i) {
        int anoAtual = 0;
        int aux = 0;
        System.out.print("Em que ano esta? ");
        anoAtual = entrada.nextInt();
        aux = anoAtual - vetor[i].getAno();
        vetor[i].setIdade(aux);
    }

    public void imprimindo() {
        for (int i = 0; i < vetor.length; i++) {
            calculaIdade(i);
            System.out.println("Nome -> " + vetor[i].getNome());
            System.out.println("Idade ->" + vetor[i].getIdade());
            System.out.println(
                    "Data de Nascimento -> " + vetor[i].getDia() + "/" + vetor[i].getMes() + "/" + vetor[i].getAno());
            System.out.println("Altura -> " + vetor[i].getAltura());
            System.out.print("\n");
        }
    }
}
