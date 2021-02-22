package desenvolvimentoAvancJava.interfacesFuncionais;

import java.util.function.Predicate;

public class Predicados {
    /*
    Interface Funcional

    Recebem um parâmetro qualquer e retornam um boolean
     */

    public static void main(String[] args) {

        Predicate<String> estaVazio = valor -> valor.isEmpty(); // ou: 'String::isEmpty;'
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Jhonatan"));

    }
}
