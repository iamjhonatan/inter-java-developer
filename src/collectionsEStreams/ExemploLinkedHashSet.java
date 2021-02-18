package collectionsEStreams;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    /*
    LinkedHashSet:
     - Usa-se quando é necessário manter a ordem de inserção dos elementos;
     - É a implementação mais lenta, por ser necessária manter a ordem dos dados.
     */

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(13);
        sequenciaNumerica.add(277);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // Remove o número o set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        System.out.println("\nExibindo elementos com laço 'while': ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nExibindo os elementos com laço 'for': ");
        for (Integer numero: sequenciaNumerica) {
            System.out.println(numero);
        }

        // Retorna se o set está vazio ou não
        System.out.println("\nLista vazia? " + sequenciaNumerica.isEmpty());

    }
}
