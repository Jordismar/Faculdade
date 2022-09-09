import java.util.Scanner;
import java.util.Random;
public class Vetor {
    private int vet;
    private Scanner entrada;
    
    public Vetor(int tamVet){
        this.vet[] = new int[tamVet];
        for(int i = 0; i< tamVet; i++){
            this.vet[i] = 0;
        }
        this.entrada = new Scanner(System.in);
    }

    public void preencheVetor(int tamVet){
        Random rand = new Random();
        for (int i = 0; i < tamVet; i++) {
            this.vet[i] = rand.nextInt(tamVet);
        }
    }

    public int getVetor(){
        return this.vet;
    }

    public void imprimeVetor(int tamVet){
        for (int i = 0; i < tamVet; i++) {
            System.out.println("Posição ["+i+"] -> "+this.vet[i]);
        }
    }
}
