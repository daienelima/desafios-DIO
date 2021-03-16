package desafio.dio.modulo03;

/*Desafio
Voc� deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados s�o pares, quantos valores informados s�o �mpares, quantos valores informados s�o positivos e quantos valores informados s�o negativos.

Entrada
Voc� receber� 5 valores inteiros.

Sa�da
Exiba a mensagem conforme o exemplo de sa�da abaixo, sendo uma mensagem por linha e n�o esquecendo o final de linha ap�s cada uma.*/

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		int entrada;

		while (leitor.hasNextInt()) {
			entrada = leitor.nextInt();
			if (entrada % 2 == 0)
				par++;
			if (Math.abs(entrada % 2) == 1)
				impar++;
			if (entrada > 0)
				positivo++;
			if (entrada < 0)
				negativo++;
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		leitor.close();
	}
}
