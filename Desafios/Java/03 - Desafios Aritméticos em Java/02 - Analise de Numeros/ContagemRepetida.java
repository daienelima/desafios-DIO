package desafio.dio.modulo03;

/*Desafio
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();

		int entrada = sc.nextInt();
		while (entrada-- > 0)
			lista.add(sc.nextInt());

		SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
		lista.forEach(id -> contaQuant.compute(id, (key, val) -> (val == null ? 1 : val + 1)));

		contaQuant.entrySet().forEach(entry -> {
			System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
		});

		sc.close();
	}
}
