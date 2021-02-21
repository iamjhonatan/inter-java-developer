package desenvolvimentoAvancJava;

public class TailCall {

    /*
        Mais utilizado em paradigmas funcionais
        No java, não temos a opção de lidar com o TailCall, por causa da JVM que não consegue entender.
        Não há nenhuma linha de código depois da chamada do próprio método
        É uma recursão onde não há nenhuma linha de código após a chamada do próprio método e, sendo assim,
         não há nenhum tipo de processamento a ser feito após a chamada recursiva
     */

    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA (double valor) {
        return fatorialComTailCall(valor, 1);
    }

    public static double fatorialComTailCall (double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor -1, numero * valor);
    }
    // Premissa: pega os números do final para o início: 5 * 4 * 3 * 2 * 1
}
