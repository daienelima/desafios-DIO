package desafio.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipicacaoSimples {

	//Voc� receber� dois valores inteiros. Fa�a a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta opera��o � vari�vel PROD, mostrando esta de acordo com a mensagem de sa�da esperada 
	//Entrada
	//A entrada cont�m 2 valores inteiros.
	//Sa�da
	//Exiba a vari�vel PROD conforme exemplo abaixo, tendo obrigatoriamente um espa�o em branco antes e depois da igualdade.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int total = a * b;
		System.out.println("PROD = " + total);
	}

}
