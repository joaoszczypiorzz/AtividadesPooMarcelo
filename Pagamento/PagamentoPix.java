package Pagamento;

public class PagamentoPix implements Pagamento{
    double taxa;

    //constructor
    public PagamentoPix(double taxa) {
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
