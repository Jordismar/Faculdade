
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int num1;
		
		System.out.print("Informe um número: ");
		
		num1 = entrada.nextInt();
		
		int multi = 0;
		int resultado = num1;
		
		
		while(num1 > 1){
			//System.out.println("Antes Laço "+resultado);
			multi = num1;
			num1--;
			resultado = resultado*num1;
			//System.out.println("Depois laço "+resultado);
		}

		System.out.println(resultado);
	}

}
