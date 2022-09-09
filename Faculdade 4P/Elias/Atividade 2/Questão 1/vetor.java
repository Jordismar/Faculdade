import java.util.Scanner;
import java.util.Random;
public class vetor {
    
    public vetor(int tamVet){
        int vet[] = new int[tamVet];
        Scanner entrada = new Scanner(System.in);
    }

    public void preencheVetor(int tamVet){
        Random rand = new Random();
        for (int i = 0; i < tamVet; i++) {
            this.vet[i] = rand.nextInt(tamVet);
        }
    }

    public void imprimeVetor(int tamVet){
        for (int i = 0; i < tamVet; i++) {
            System.out.println("Posição ["+i+"] -> "+this.vet[i]);
        }
    }
}
