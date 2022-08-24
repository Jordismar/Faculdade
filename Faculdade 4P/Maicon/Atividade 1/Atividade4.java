package atividade_maicon_rev01;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c;

		System.out.print("Informe o lado A -> ");
		a = entrada.nextInt();
		
		System.out.print("Informe o lado B -> ");
		b = entrada.nextInt();
		
		System.out.print("Informe o lado C -> ");
		c = entrada.nextInt();
	
		if(a>(b+c)) {
			System.out.println("É um triângulo!");
		}
		else {
			System.out.println("Não é um triângulo!");
		}
	}
	

}
