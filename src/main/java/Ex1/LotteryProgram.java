package Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryProgram {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> fiftyNumbers = new ArrayList<>();
        List<Integer> thirteenNumbers = new ArrayList<>();

        for(int i = 1; i <= 50; i++) {

            fiftyNumbers.add(i);

            if(i > 13) {
                continue;
            } //em vez de outro ciclo, podemos aproveitar este

            thirteenNumbers.add(i);
        }

        // Esta forma é a mais direta, porque não necessitamos de verificar "duplicados":
        List<Integer> mainDraw = new ArrayList<>();
        List<Integer> suplementarDraw = new ArrayList<>();

        for(int i = 0; i < 5; i++) { // 5 bolas
            int randomIndex = rand.nextInt( fiftyNumbers.size() );
            mainDraw.add( fiftyNumbers.remove(randomIndex) );
        }

        // Só precisamos de um valor aleatório - não "repetido"
        int supplementary;
        do {
            supplementary = thirteenNumbers.get( rand.nextInt( 13 ) );
        } while( mainDraw.contains(supplementary)); // se chave principal contiver numero, temos de repetir

        suplementarDraw.add( supplementary );

        // Ordenar os números sorteados por ordem crescente (ordenação natural)
        Collections.sort(mainDraw);

        //Apresentar chaves
        System.out.println("Chave principal: " + mainDraw);
        System.out.println("Número suplementar: " + suplementarDraw);
    }
}
