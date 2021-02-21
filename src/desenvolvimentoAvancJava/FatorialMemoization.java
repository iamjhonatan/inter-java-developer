package desenvolvimentoAvancJava;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {

    /*
        Utilizamos quando queremos usar a recursividade e a partir da segunda chamada,
        ter uma melhor performance, guardando o primeiro valor em cache
    */
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("FATORIAL 1" + (F - I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("FATORIAL 2 " + (F - I));
    }

    public static Integer fatorialComMemoization (Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey(value)) {
                return MAPA_FATORIAL.get(value);
            } else {
                Integer resultado = value * fatorialComMemoization(value -1);
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }
}
