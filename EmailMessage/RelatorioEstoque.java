package EmailMessage;

public class RelatorioEstoque implements Exportavel{
    @Override
    public String exportar() {
        return "";
    }

    @Override
    public String cabecalho() {
        return Exportavel.super.cabecalho();
    }

}
