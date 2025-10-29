package EmailMessage;

public class RelatorioService{
    private Notificador notificador;
    private Exportavel exportavel;

    public RelatorioService(Notificador notificador, Exportavel exportavel){
        this.exportavel = exportavel;
        this.notificador = notificador;
    }

    public void gerarEEnviar(String destino){
        String conteudo = exportavel.exportar();
        notificador.enviar(destino, conteudo);
    }

}
