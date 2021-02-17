package collectionsEStreams;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    // LinkedList = Fila
    /*
     Queue garante a ordem de inserção
     Permite a adição, leitura e remoção com base na regra de uma Fila: o primeiro elemento que entra é o primeiro que sai (FIFO).
     Não é possível mudar a ordenação
     */

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pâmela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);


        // 'poll': retorna e remove o primeiro elemento da fila | se a fila estiver vazia, o retorno será 'null'
        String clienteASerAtendido = filaBanco.poll();

        System.out.println("Cliente removido com a função 'poll': " + clienteASerAtendido);
        System.out.println(filaBanco);


        // 'peek': retorna mas não remove o primeiro elemento da fila | se a fila estiver vazia, o retorno será 'null'
        String primeiroCliente = filaBanco.peek();

        System.out.println("Primeiro cliente da fila exibido, mas não removido com a função 'peek': " + primeiroCliente);
        System.out.println(filaBanco);


        // 'element': retorna mas não remove o primeiro elemento da fila | se a fila estiver vazia, o retorno será uma exceção
        String primeiroClienteOuErro = filaBanco.element();

        System.out.println("Primeiro cliente da fila exibido, mas não removido com a função 'element' (ou uma exceção será lançada em casode fila vazia): " + primeiroClienteOuErro);
        System.out.println(filaBanco);

    }
}
