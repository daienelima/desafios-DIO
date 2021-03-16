package desafio.dio.modulo03;

/*Pense um número positivo n. Agora me diga um divisor A de n. Agora me dê um outro número B que não seja divisor de n. Agora um múltiplo C. E um não múltiplo D. O número que você pensou é...

Parece um truque de mágica, mas é matemática! Será que, conhecendo os números A, B, C e D, você consegue descobrir qual era o número original n? Note que pode existir mais de uma solução!

Neste problema, dados os valores de A, B, C e D, você deve escrever um programa que determine qual o menor número n que pode ter sido pensado ou concluir que não existe um valor possível.

Entrada
A entrada consiste de uma única linha que contém quatro números inteiros A, B, C, e D, como descrito acima (1 ≤ A, B, C, D ≤ 109).

Saída
Seu programa deve produzir uma única linha. Caso exista pelo menos um número n para os quais A, B, C e D façam sentido, a linha deve conter o menor n possível. Caso contrário, a linha deve conter -1.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		br.close();

		int menorValor = -1;

		if (C % A == 0) {
			for (int i = 1; i <= C / A; i++) {
				int n = A * i;
				if (n % B != 0 && D % n != 0 && C % n == 0) {
					menorValor = n;
					break;
				}
			}
		}
		System.out.println(menorValor);
	}
}
