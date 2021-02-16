package datas;

import java.util.Calendar;

public class ExercicioFinal {

    public static void main(String[] args) {

        // Supondo que a data do vencimento do boleto seja a data atual
        Calendar dataVencimento = Calendar.getInstance();
        System.out.printf("A data de vencimento do boleto é: %tF\n", dataVencimento);

        // Pegando a data do vencimento do boleto e adicionando 10 dias para que seja a data limite de pagamento sem juros.
        dataVencimento.add(Calendar.DATE, 10);
        System.out.printf("A data limite para fazer o pagamento sem juros é: %tF\n", dataVencimento);

        /*
        Fazendo a verificação de quando ocorrerá o vencimento
        Caso seja em um sábado, a data de vencimento terá um acréscimo de 2 dias, para que seja no próximo dia útil (segunda-feira).
        Caso seja em um domingo, a data de vencimento terá um acréscimo de 1 dia, para que seja no próximo dia últil (segunda-feira).
        Caso seja em qualquer outro dia, continua valendo a data inicial.
         */
        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            dataVencimento.add(Calendar.DATE, 2);
            System.out.printf("O vencimento seria em um sábado. Data alterada para a próxima segunda-feira, dia %tF\n", dataVencimento.getTime());
        } else if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            dataVencimento.add(Calendar.DATE, 1);
            System.out.printf("O vencimento seria em um domingo. Data alterada para a próxima segunda-feira, dia %tF\n", dataVencimento.getTime());
        }
    }

}
