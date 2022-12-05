import java.util.InputMismatchException;
import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Robo robo = new Robo();
		int escolha = 0;
		float bateria;
		do {
			System.out.println("1- Robo sem bateria");
			System.out.println("2- Robo com bateria");
			try {
				escolha = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
				escolha = 0;
				entrada.nextLine();
			}
			switch (escolha) {
				case 1:
					robo = new Robo();
					break;
				case 2:
					System.out.println("Informe o nivel de bateria:");
					bateria = entrada.nextFloat();
					robo = new RoboBateria(bateria);
					break;
			}
		} while (escolha > 2 || escolha < 0);
		do {
			System.out.println("1- Aumentar X");
			System.out.println("2- Aumentar Y");
			System.out.println("3- Diminuir X");
			System.out.println("4- Diminuir Y");
			System.out.println("0- Sair");
			try {
				escolha = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
				escolha = 5;
				entrada.nextLine();
			}
			switch(escolha) {
				case 0:
					robo.mostraPosicao();
					break;
				case 1:
					robo.aumentaX();
					break;
				case 2:
					robo.aumentaY();
					break;
				case 3:
					robo.diminuiX();
					break;
				case 4:
					robo.diminuiY();
					break;
			}
		}while(escolha != 0);
		entrada.close();
	}
}