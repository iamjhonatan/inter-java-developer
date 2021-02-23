import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    /*
    Lançada no Java 10
    Inferência é a capacidade de abstrair o tipo das vaiáveis
    'var': somente conseguimos usá-lo em ambiente local, nunca a nível global (classes)
    'var': não pode ser utilizado como parâmetro
    'var': não pode ser utilizado em variáveis que não sejam inicializadas
     */

    public static void main(String[] args) throws IOException {
        imprimirNomeCompleto("Jhonatan", "Medeiros");

    }

    private static void connectAndPrintURLJavaOracle() throws IOException {

        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void imprimirNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }
}
