import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // List que armazenara todas as palavras que o usuario digitar
        List<String> entradaUsuario = new ArrayList<>();

        // Enquanto existirem proximas palavras do StringTokenizer, adicione na List<String> entradaUsuario
        while (st.hasMoreTokens()) {
            entradaUsuario.add(st.nextToken());
        }

        // List que armazenara todas as palavras que foram abreviadas
        List<String> palavrasAbreviadas = new ArrayList<>();

        Map<String, String> resultadoAbreviacao = new HashMap<>();

        /*
        Para cada palavra que o usuario digitar, verificar se existe em alguma String.
        Se for digitado '.', não tera nenhum retorno.
        Caso a palavra exista, substituir pela letra determinada com 'replace'.
        No final, adicionar na List<String> palavrasAbreviadas.
         */
        for (String palavra : entradaUsuario) {
            if (palavra.equals(".")){
                return;
            }
            String abcdef = palavra.replace("abcdef", "a.");

            palavrasAbreviadas.add(abcdef);
            if (abcdef.contains(".")){
                resultadoAbreviacao.put(abcdef, palavra);
            }
        }

        // Transformando um ArrayList em uma String
        String textoAbreviado = "";
        for (String abreviado: palavrasAbreviadas){
            textoAbreviado += abreviado + " ";
        }

        // Contando o numero de palavras abreviadas
        int contadorPalavrasAbreviadas = 0;
        for (String palavraAbreviada: palavrasAbreviadas){
            if(palavraAbreviada.contains(".")){
                contadorPalavrasAbreviadas++;
            }
        }

        String resultado = resultadoAbreviacao.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.joining(" "));

        System.out.println("\n" + textoAbreviado);
        System.out.println(contadorPalavrasAbreviadas);
        System.out.println(resultado);
    }

}
