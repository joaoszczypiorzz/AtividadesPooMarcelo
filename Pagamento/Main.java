package Pagamento;

public class Main {
    public static void main(String[] args) {

        Pagamento cartao = new PagamentoCartão(0.05);

        cartao.pagar(100);

        System.out.println("------------------");
        Pagamento pix = new PagamentoPix(0.05);
        pix.pagar(200);
    }
}
