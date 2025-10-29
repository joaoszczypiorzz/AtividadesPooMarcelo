package EmailMessage;

public class RelatorioEstoque implements Exportavel{
    @Override
    public String exportar() {
        return "---EXPORT---\n" +
                "\"estoque\": [\n" +
                "    {\"produto\": \"Camisa\", \"quantidade\": 10},\n" +
                "    {\"produto\": \"Calça\", \"quantidade\": 5}\n" +
                "  ]";
    }

    @Override
    public String cabecalho() {
        return Exportavel.super.cabecalho();
    }

}
