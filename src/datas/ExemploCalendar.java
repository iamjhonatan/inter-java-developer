package datas;

import java.util.Calendar;

public class ExemploCalendar {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());
        // A data corrente é a data e hora atual

        agora.add(Calendar.DATE, -15);
        System.out.println("A data atual, 15 dias atrás: " + agora.getTime());
        // Pegando a data atual, diminuindo 15 dias e printando no console

        agora.add(Calendar.MONTH, 4);
        System.out.println("Após 4 meses: " + agora.getTime());
        // Pegando a última data impressa, calculando mais 4 meses

        agora.add(Calendar.YEAR, 2);
        System.out.println("Após 2 anos: " + agora.getTime());
        // Printando no console a data impressa anteriormente, acrescentando 2 anos.
    }
}
