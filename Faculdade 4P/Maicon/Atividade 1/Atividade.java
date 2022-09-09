import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int num1;

		System.out.print("Informe um dia da semana (1 a 7): ");

		num1 = entrada.nextInt();

		switch (num1) {
			case 1:
				System.out.println("Dia da semana é  Domingo");

			case 2:
				System.out.println("Dia da semana é Segunda");
				break;

			case 3:
				System.out.println("Dia da semana é Terça");
				break;

			case 4:
				System.out.println("Dia da semana é Quarta");
				break;

			case 5:
				System.out.println("Dia da semana é Quinta");
				break;

			case 6:
				System.out.println("Dia da semana é Sexta");
				break;

			case 7:
				System.out.println("Dia da semana é Sábado");
				break;
			default:
				System.out.println("Número informado não corresponde a um dia da semana");

		}
	}
}
