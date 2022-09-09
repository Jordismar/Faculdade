import java.util.Scanner;
public class vetorView {
    public static void main(String[] args) {
        Scanner entradaQuant = new Scanner(System.in);
        int tamVet = 0;
        System.out.print("Informe o tamanho do vetor -> ");
        tamVet = entradaQuant.nextInt();

        vetor vet = new vetor(tamVet);
        vet.preencheVetor();
        vet.imprimeVetor();
    }
}
