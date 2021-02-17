package collectionsEStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    /*
    Garante a ordem de inserção
    Tem as mesmas funcionalidades do Array nativo, mas de forma dinâmica
    Permite adicionar, atualizar, ler e remover sem regras adicionais
     */

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("Saída dos dados com a mesma ordem de entrada:\n" + nomes + "\n");

        Collections.sort(nomes);
        System.out.println("Saída dos dados utilizando a função 'sort' (imprimindo por ordem alfabética):\n" + nomes + "\n");

        // A função 'set' recebe dois parâmetros: o primeiro é índice que será alterado dentro da Lista e o segundo é o novo valor
        nomes.set(3, "Ju");
        System.out.println("Nova lista com o índice 3 atualizado, utilizando a função 'set':\n" + nomes + "\n");

        // Removendo um item passando o índice desse elemento
        nomes.remove(3);
        System.out.println("Removendo um item pelo índice, utilizando a função 'remove':\n" + nomes + "\n");

        // Removendo um item passando o valor desse item
        nomes.remove("Carlos");
        System.out.println("Removendo um item pelo valor, utilizando a função 'remove':\n" + nomes + "\n");

        // Pegando um elemento pelo índice e atribuindo-o a uma variável
        String funcaoGet = nomes.get(0);
        System.out.println("Pegando um elemento da lista pelo seu índice, utilizando a função 'get':\n" + funcaoGet + "\n");

        // Verificando o tamanho da lista e retornando um número inteiro
        int tamanhoDaLista = nomes.size();
        System.out.println("Verificando o tamanho da lista e retornando o valor como um número inteiro, utilizando a função 'size':\n" + tamanhoDaLista + "\n");

        // Verificando se existe um item específico na lista, passando seu valor como parâmetro
        boolean temJoao = nomes.contains("João");
        System.out.println("Verificando se existe um elemento específico na lista, utilizando a função 'contains':\n" + temJoao + "\n");

        // Verificando se a lista está vazia ou não
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Verificando se a lista está vazia ou não, utilizando a função 'isEmpty':\n" + listaVazia + "\n");

        // Limpando a lista
        //nomes.clear();
        //System.out.println("Limpando a lista com o método 'clear':\n" + nomes + "\n");


        // Navegando na lista utilizando o 'ForEach'
        for (String nomeDoItem:  nomes) {
            System.out.println("->" + nomeDoItem);
        }

        System.out.println();

        // A função 'hasNext' verifica se existe o elemento, retornando 'true or false', já o next retorna o objeto
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("==>" + iterator.next());
        }



        /*
        Outras funções:
        'indexOf': passando o valor do elemento como parâmetro para verificar seu índice | quando o elemento não é encontrado, a função retorna ' -1 '.
         */
    }
}
