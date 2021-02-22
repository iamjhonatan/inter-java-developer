package desenvolvimentoAvancJava;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {
        /*
        Method Reference

        Consumer: é uma interface que recebe um parâmetro e não tem retorno

         */

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
