package desafio.dio;

import java.util.Scanner;

public class MenorEPosicao {

	//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.
	///Entrada
	//O arquivo de entrada cont�m 1 valor inteiro qualquer.
	//Sa�da
	//Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		for (int i = 0; i <= num; i++) { 
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
