package EmailMessage;

public class RelatorioVendas implements Exportavel{

    @Override
    public String exportar() {
        return "---EXPORT---\n" +
                "Camisa,10,250.00\n" +
                "Calça,5,400.00";
    }

    @Override
    public String cabecalho() {
        return Exportavel.super.cabecalho();
    }
}



