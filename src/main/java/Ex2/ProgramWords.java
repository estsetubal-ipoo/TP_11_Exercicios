package Ex2;

import java.util.*;

public class ProgramWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        System.out.print("Escreva uma frase: ");
        String phrase = sc.nextLine(); // Exemplo: O mundo da programação é incrível

        String[] words = phrase.split(" ");
        for(String s : words) {
            wordList.add(s);
        }

        // Lista original
        System.out.println(wordList);

        // Lista ordenada
        Collections.sort(wordList);
        System.out.println(wordList);

        // Lista ordenada decrescentemente
        Collections.reverse(wordList);
        System.out.println(wordList);

        // Lista baralhada
        Collections.shuffle(wordList);
        System.out.println(wordList);

        // List ordenada por tamanho de palavra
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println(wordList);

        // Frase final
        String finalPhrase = "";
        for(String s : wordList) {
            finalPhrase += s + " ";
        }
        System.out.println(finalPhrase);
    }
}
