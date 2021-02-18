package collectionsEStreams.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    /*
    HashSet:
     - Usa-se quando não é necessário manter uma ordenação;
     - Não permite valores repetidos;
     - Por não ser ordenado nem permitir repetição, é a implementação mais performática, quando falando da leitura dos dados.


    java.util.Set

    Por padrão, não garante ordem.
    Não permite itens repetidos.
    Permite a adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação.
    Não permite mudança de ordenação.
     */

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        // Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        // Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        System.out.println("\nCom laço 'while': ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nCom laço 'for': ");
        for (Double nota: notasAlunos) {
            System.out.println(nota);
        }

        notasAlunos.clear();

        // Retorna se o set está vazio ou não
        System.out.println("\nLista vazia? " + notasAlunos.isEmpty());
    }
}
