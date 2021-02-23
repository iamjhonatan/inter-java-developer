import java.util.stream.IntStream;

public class ParallelStreamExemplo {

    /*
    Usamos quando vamos trabalhar com muitos dados, com vários objetos, e que não dependem um do outro
     */

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num)); // SerialStream
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do Serial: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num)); // ParallelStream
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do Parallel: " + (fim - inicio));

    }

    public static long fatorial (long num) {
        long fat = 1;

        for (long i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }


}
