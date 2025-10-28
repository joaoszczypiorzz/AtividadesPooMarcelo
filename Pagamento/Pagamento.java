package Pagamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Pagamento {
    void pagar(double valor);
    default String recibo(double valor){

        //verificação para não receber valores de pagamento negativo ou igual a zero
        if(valor <=0) throw new IllegalArgumentException("Valor não pode ser negativo ou igual a Zero");

        //definindo variaveis que são chamadas no recibo
        String meio = getClass().getSimpleName();
        double taxa = taxaAplicada();
        if(taxa < 0 || taxa > 1) throw new IllegalArgumentException("Taxa precisa estar entre 0 e 1");
        double total = valor + valor*taxa;
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return  "===RECIBO===\n" +
                "Meio de pagamento: " + "\n" +
                "Data: " + data + "\n" +
                "Valor: R$" + String.format("%.2f",valor) + "\n" +
                "Taxa: " + String.format("%.2f",taxa) + "\n" +
                "Total pago: " + total + "\n";
    }

     default double taxaAplicada(){
        return 0.0;
    }


}
