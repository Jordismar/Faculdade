package atividade_maicon_rev01;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int vetor[];
		int maior = 0;
		int posicao = 0;
		vetor = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		
		while(i<5) {
			System.out.print("Informe um número para a posição "+i+" -> ");
			vetor[i] = entrada.nextInt();
			i++;
		}
		
		i=0;
		while(i<5) {
			System.out.println("O número na posição "+i+" é -> "+vetor[i]);
			i++;
		}
		
		maior = vetor[0];
		for(i=0;i<5;i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
			
		System.out.println("Maior numero -> " + maior);
		System.out.println("Posição do maior numero ->" + posicao);
	}

}
