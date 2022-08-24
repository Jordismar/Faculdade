import java.util.Scanner;

public class doisNumeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.print("Informe o primeiro numero -> ");
        num1 = entrada.nextInt();
        System.out.print("Informe o segundo numero -> ");
        num2 = entrada.nextInt();

        float quociente = 0;
        quociente = num1/num2;
        float soma = 0;
        soma = num1 + num2;
        float produto = 0;
        produto = num1 * num2;
        float diferenca = 0;
        diferenca = num1 - num2;

        System.out.println(" Quociente -> " + quociente);
        System.out.println(" Soma -> " + soma);
        System.out.println(" Produto -> " + produto);
        System.out.println(" Diferença -> " + diferenca);
    }
}
