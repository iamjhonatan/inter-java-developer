package desenvolvimentoAvancJava;

import java.util.function.Supplier;

public class Supridores {

    /*
    Interface Funcional
    Supridores
    Não recebem parâmetro e retornam algo do tipo especificado no Generics
     */

    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa(); // ou: 'Pessoa::new;'

        System.out.println(instanciaPessoa.get());
    }
}


class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Jhonatan";
        idade = 25;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d", nome, idade);
    }
}
