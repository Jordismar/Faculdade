import java.util.Scanner;
public class VetorView {
    public static void main(String[] args) {
        Scanner entradaQuant = new Scanner(System.in);
        int tamVet = 0;
        System.out.print("Informe o tamanho do vetor -> ");
        tamVet = entradaQuant.nextInt();

        Vetor veto = new Vetor(tamVet);
        veto.getVetor();        
        veto.preencheVetor();
        veto.imprimeVetor();
    }
}
