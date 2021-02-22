package desenvolvimentoAvancJava;

public class FuncaoAltaOrdem {

    /*
    Interface Funcional
    Funções de alta ordem são funcções que recebem uma função por parâmetro ou retornam uma função
    A linguagem Java não pe uma linguagem funcional, então as Lambdas e interfaces funcionais são modos
    do Java adicionar esses paradigmas à linguagem.
     */

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo sub = (a, b) -> a - b;
        Calculo divisao = (a, b) -> a / b;
        Calculo multi = (a, b) -> a * b;

        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(sub, 4, 3));
        System.out.println(executarOperacao(divisao, 4, 2));
        System.out.println(executarOperacao(multi, 7, 3));

    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular (int a, int b);
}
