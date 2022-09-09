import java.util.Scanner;
public class vetorView {
    public static void main(String[] args) {
        Scanner entradaQuant = new Scanner(System.in);
        int tamVet = 0;
        System.out.print("Informe o tamanho do vetor -> ");
        tamVet = entradaQuant.nextInt();

        vetor veto = new vetor(tamVet);
        veto.preencheVetor();
        veto.imprimeVetor();
    }
}
