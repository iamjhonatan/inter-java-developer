package collectionsEStreams.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    /*
    Stream API pode ser aplicada em qualquer interface que estenda de Collections
    Utilizada para manipular grande quantidade de dados, pensando em performance
    Premissa da programação funcional e paralela
     */

    public static void main(String[] args) {

        // Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adicionando estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliette");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do Stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra 'R' no nome
        System.out.println("Elementos com a letra 'R' no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retornando os 3 primeiros elementos da coleção: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornas outras coleção
        System.out.println("Retorna os elementos novamente: " );
        estudantes.stream().forEach(System.out::println);

        // Retorna 'true' se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem 'W' no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna 'true' se alguns dos elementos tem a letra minúscula no nome
        System.out.println("Tem algum elemento com a minúscula no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção, se existir, exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante) ->
                estudante.toLowerCase().contains("r"))
        .collect(Collectors.toList()));
    }

}
