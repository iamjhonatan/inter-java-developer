package desenvolvimentoAvancJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    /*
    Stream: não tem construtor
    Stream é um pouco mais lento, por usar o paradigma funcional
     */

    public static void main(String[] args) {
        String[] nomes = {"Jhonatan", "Paulo", "Roberto", "Rafael", "Kaleb", "Marcos"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        //imprimirODobroDeCadaItemNaLista(numeros);

        List<String> listaProfissoes = new ArrayList<>();
        listaProfissoes.add("Desenvolvedor");
        listaProfissoes.add("Testador");
        listaProfissoes.add("Gerente de Projeto");
        listaProfissoes.add("Gerente de Qualidade");

        listaProfissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Jhonatan")) {
                nomesParaImprimir += " " + nomes[i];
            }
        }
        System.out.println("Nomes do 'for': " + nomesParaImprimir);


        String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("Jhonatan"))
                .collect(Collectors.joining()); // Pega um array de string e transoforma em um único valor

        System.out.println("Nomes do 'Stream': " + nomesResultados);
    }

    public static void imprimirTodosNomes (String... nomes) {
        for (String nome: nomes) {
            System.out.println("Imprimindo com 'for': " + nome);
        }

        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void imprimirODobroDeCadaItemNaLista(Integer... numeros) {
        for (Integer numero: numeros) {
            System.out.println("Números dobrados com 'for': " + numero * 2);
        }

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
