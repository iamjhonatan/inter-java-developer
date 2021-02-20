package collectionsEStreams.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

    /*
    Tratamento de valores que podem ser nulos
    Possui 2 estados: Presente/Vazio
    Permite que você execute operações em valores que podem ser nulos sem preocupação com as famosas
    NullPointerExceptions
     */

    public static void main(String[] args) {

        // Método 'of' recebe um valor do tipo que estamos trabalhando ('string')
        Optional<String> optionalString = Optional.of("Valor presente");

        // 'ifPresentOrElse' recebe 2 argumentos, o primeiro é para caso o valor esteja presente | o segundo, caso nçao esteja
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));


        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));


        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente ***");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não está presente"));


        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança um erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro= não está presente"));


    }
}
