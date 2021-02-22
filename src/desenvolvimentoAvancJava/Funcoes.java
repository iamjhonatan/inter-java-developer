package desenvolvimentoAvancJava;

import java.util.function.Function;

public class Funcoes {

    /*
    As funções recebem um parâmetro e devem retornar um parâmetro também
     */

    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) *2 ;
        System.out.println(retornarNomeAoContrario.apply("jhonatan"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
    }
}
