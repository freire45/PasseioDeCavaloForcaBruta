package br.com.erickfreire.passeidecavalo;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que simula um tabuleiro de damas e o andar da peça cavalo
 * 
 * @author Erick Freire
 * @version 1 criado em 13-07-2021 as 18:20
 */

public class PasseioDeCavaloForcaBruta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		SecureRandom numeroAleatorio = new SecureRandom();

		int[][] vetor = new int[8][8];
		int linha;
		int coluna;
		int contador = 0;
		int opcao = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				vetor[i][j] = 0;
			}
		}

		System.out.println("Simulador De Tabuleiro de Xadrez, o 1 Representa a posição do Cavalo: ");

		
		for(int a = 1; a <= 1000; a++) {

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.printf("%d  ", vetor[i][j]);

					if (j == 7) {
						System.out.println();
					}
				}

			}

			System.out.println();

			linha = 1 +numeroAleatorio.nextInt(8);
			coluna = 1 + numeroAleatorio.nextInt(8);

			if (vetor[linha - 1][coluna - 1] == 0) {
				vetor[linha - 1][coluna - 1] = 1;
				contador += 1;
			} else {
				if (vetor[linha - 1][coluna - 1] == 1) {
					System.out.println("\nErro: Linha já foi visitada!");
				}
			}
	     }

		System.out.printf("\nVocê Percorreu %d de casas no tabuleiro", contador);
		System.out.println("\nPrograma Finalizado!");

	}
}
