package desafio.dio.modulo02;

/*Desafio
Pedro e Fernando s�o os desenvolvedores em uma stratup e v�o desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task � fazer o c�digo que valide as senhas que s�o cadastradas, para isso voc� deve atentar aos requisitos a seguir:

A senha deve conter, no m�nimo, uma letra mai�scula, uma letra min�scula e um n�mero;
A mesma n�o pode ter nenhum caractere de pontua��o, acentua��o ou espa�o;
Al�m disso, a senha pode ter de 6 a 32 caracteres.
Entrada
A entrada cont�m v�rios casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que � inserida pelo usu�rio no momento do cadastro.

Sa�da
A sa�da cont�m uma linha, que pode ser �Senha valida.�, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou �Senha invalida.�, se um ou mais requisitos n�o forem atendidos.
*/

import java.util.*;

public class ValidadorDeSenhasComRequisitos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?!.*[\\W|_])[a-zA-Z0-9]{6,32}";
		String senha = "";
		
		while (scanner.hasNext()) {
			senha = scanner.nextLine();
			if (senha.matches(regex)) {
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
		}
		scanner.close();
	}
}
