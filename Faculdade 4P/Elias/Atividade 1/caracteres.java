import java.util.Scanner;
public class caracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = "";
        System.out.print("Informe a frase -> ");
        frase = entrada.nextLine();
        int totalDeA = 0;
        char temp;
        for (int i = 0; i < frase.length(); i++) {

            temp = frase.charAt(i);
            if (temp == 'a' || temp == 'A')
            totalDeA++;
        }

        System.out.println("\n\nNa frase: "+ frase + "\n Teve um total de -> " + totalDeA + " <- de letras a ou A\n");
    }
}