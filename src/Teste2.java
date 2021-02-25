import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Teste2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> teste = new ArrayList<>();
        List<String> resultado = new ArrayList<>();


        String[] listaDePalavras = new String[Integer.parseInt(br.readLine())];

        String contador = br.readLine();
        while(br.readLine() != "0"){


        }

//        while (st.hasMoreTokens()) {
//            teste.add(st.nextToken());
//        }

        String conjunto = "Conjunto bom";

        for (String palavra: teste){
            if (!palavra.matches("[0-9]*")){
                for (String palavra2: teste){
                    if(palavra.contains(palavra2) && !palavra.equals(palavra2)){
                        conjunto = "Conjunto ruim";
                        resultado.add(conjunto);
                        conjunto = "Conjunto bom";
                        break;
                    }
                }
            }

        }

//        System.out.println(teste);
        System.out.println(resultado);

    }
}