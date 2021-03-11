package desafio.dio.modulo02;


/*Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, 
 * para compartilhar suas experiências e aprendizados com seus amigos.
Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um 
limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra 
e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e
 a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, 
escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. 
A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no
 texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial.
*/

import java.util.*;

public class AbreviandoPostBlog {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(scanner.hasNextLine()){
      String phrase = scanner.nextLine();

      if(phrase.isEmpty() || phrase.equals(".")){
        break;
      }else{
        reduce(phrase);
      }
    }
    scanner.close();
  }

  private static void reduce(String phrase){
    String[] phraseArray = phrase.split(" ");
    String[] phraseArrayDistinct = Arrays.stream(phrase.split(" ")).distinct()
        .sorted().toArray(String[]::new);

    if(phraseArray.length == 0){
      return ;
    }

    String[] alphabetArray =
        new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    int count = 0;
    String[] phraseReplaced = Arrays.copyOf(phraseArray, phraseArray.length);
    List<String> words = new ArrayList<>();

    for(String letter : alphabetArray){
      List<String> wordsByLetter = GetWordsByLetter(phraseArrayDistinct, letter);

      if(wordsByLetter != null){
        String word = GetHighestWord(phraseArray, wordsByLetter);

        words.add(word);
        count++;
        replace(phraseReplaced, word);
      }
    }

    print(phraseReplaced, count, words);
  }

  private static void print(String[] phraseReplaced, int count, List<String> words){
    System.out.println(String.join(" ", phraseReplaced));
    System.out.println(count);

    for(String word : words){
      System.out.println(word.charAt(0) + ". = " + word);
    }
  }

  private static List<String> GetWordsByLetter(String[] phraseArrayDistinct, String letter){
    //list only words with letter target
    List<String> words = new ArrayList<>();

    for (String wordDistinct : phraseArrayDistinct) {
      if(wordDistinct.length() > 2 &&
          (letter.charAt(0) == wordDistinct.charAt(0))
      ){
        words.add(wordDistinct);
      }
    }

    if(words.size() == 0){
      return null;
    }

    return words;
  }
  private static String GetHighestWord(String[] phraseArray, List<String> words){
    //analyzes the better letter to replace
    //using mathematics
    int lengthReduced = 0;
    String word = null;

    for (String _word : words) {
      int _count = CountWordRepeated(phraseArray, _word) ;
      int _lengthReduced = (_count * _word.length()) - (_count * 2);

      if(lengthReduced == 0 || (_lengthReduced > lengthReduced)
      ){
        lengthReduced = _lengthReduced;
        word = _word;
      }
    }

    return word;
  }
  private static int CountWordRepeated(String[] phraseArray, String word){
    int count = 0;

    for (String _word : phraseArray) {
      if (_word.equals(word)) {
        count++;
      }
    }

    return count;
  }

  private static void replace(String[] outPhraseArray, String word){
    for (int i = 0; i < outPhraseArray.length; i++) {
      if(outPhraseArray[i].equals(word)){
        outPhraseArray[i] = word.charAt(0) + ".";
      }
    }
  }
}