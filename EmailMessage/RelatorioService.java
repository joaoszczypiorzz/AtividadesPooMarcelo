package EmailMessage;

public class RelatorioService implements Exportavel,Notificador{
    String destino;
    @Override
    public String exportar() {
        return "";
    }

    @Override
    public String cabecalho() {
        return Exportavel.super.cabecalho();
    }

    @Override
    public void enviar(String destino, String mensagem) {

    }

    String gerarEEnviar(String destino){
        exportar();
        enviar("e-mail","Olá eu estou fazendo testes com o meu código");
        this.destino = destino;
        return destino;
    }

}
