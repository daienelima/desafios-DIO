package desafio.dio.modulo02;

/*Desafio
A nutricionista Juliana Alcantra � uma excelente profissional de sua �rea. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situa��o, sua fala ficou um pouco distorcida, repetindo o final de cada palavra ap�s dizer a mesma. Para que isso n�o aconte�a novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

Entrada
Haver� diversos casos de teste. Cada caso de teste � formado por uma palavra, de, no m�ximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.

Sa�da
Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padr�o, de modo a consertar todos os casos
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntrevistaEmbaracosa {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String proximaPalavra = null;

		while ((proximaPalavra = br.readLine()) != null) {
			var encontrouRepeticao = false;
			for(int i = 0; i <= proximaPalavra.length() -1; i++) {
				if(proximaPalavra.substring(0,i).endsWith(proximaPalavra.substring(i))) {
					System.out.println(proximaPalavra.substring(0,i));
					encontrouRepeticao = true;
				}
			}
			if(!encontrouRepeticao) {
				System.out.println(proximaPalavra);
			}
		}
	}
}
