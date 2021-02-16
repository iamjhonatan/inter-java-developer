package datas;

import java.util.Calendar;

public class ExemploCalendar {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("A data corrente é: %tc\n", agora);
        // A data corrente é a data e hora atual

        agora.add(Calendar.DATE, -15);
        System.out.printf("A data atual, 15 dias atrás: %tc\n", agora);
        // Pegando a data atual, diminuindo 15 dias e printando no console

        agora.add(Calendar.MONTH, 4);
        System.out.printf("Após 4 meses: %tc\n", agora);
        // Pegando a última data impressa, calculando mais 4 meses

        agora.add(Calendar.YEAR, 2);
        System.out.printf("Após 2 anos: %tc\n", agora);
        // Printando no console a data impressa anteriormente, acrescentando 2 anos.
    }
}
