

import java.util.Scanner;

public class prestacoes {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
            int prestacoes = 0;
            float vt = 0;

            System.out.print("Informe a quantidade de prestações -> ");
            prestacoes = entrada.nextInt();

            System.out.print("Informe o valor total do produto -> ");
            vt = entrada.nextFloat();

            float vPrestacao = 0;
            vPrestacao = vt/prestacoes;

            System.out.println("O valor de cada prestação é -> " + vPrestacao);
        }
}
