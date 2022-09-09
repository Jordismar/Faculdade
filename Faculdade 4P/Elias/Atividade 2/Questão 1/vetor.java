import java.util.Scanner;

public class Vetor {
    private int[] vet;
    private Scanner entrada;

    public Vetor(int tamVet) {
        this.vet = new int[tamVet];
        for (int i = 0; i < tamVet; i++) {
            this.vet[i] = 0;
        }
        this.entrada = new Scanner(System.in);
    }

    public void preencheVetor(int tamVet) {
        for (int i = 0; i < tamVet; i++) {
            System.out.print("Informe o valor para o vetor[" + i + "] -> ");
            this.vet[i] = entrada.nextInt();
        }
    }

    public int[] getVetor() {
        return this.vet;
    }

    public void imprimeVetor(int tamVet) {
        for (int i = 0; i < tamVet; i++) {
            System.out.println("Posição [" + i + "] -> " + this.vet[i]);
        }
    }
}
