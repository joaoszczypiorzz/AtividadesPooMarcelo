package Pagamento;

public class PagamentoCartão implements Pagamento{
    double taxa;

    //constructor


    public PagamentoCartão(double taxa) {
        if(taxa < 0 || taxa > 1) throw new IllegalArgumentException("Taxa precisa estar entre 0 e 1");
        this.taxa = taxa;

    }

    @Override
    public void pagar(double valor) {

        System.out.println(recibo(valor));
    }

    @Override
    public double taxaAplicada() {
        return taxa;
    }
}
