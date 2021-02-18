package collectionsEStreams;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    /*
    TreeSet:
     - Usa-se quando é necessário alterar a ordem, através do uso de comparators;
     - Mantém ordem e pode ser reordenado;
     - É performático para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet;
     */

    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima da árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        // Exibindo todas as capitais
        System.out.println(treeCapitais);

    }
}
