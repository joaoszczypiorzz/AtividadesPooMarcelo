package EmailMessage;

public class EmailNotificador implements Notificador{
    String destino;
    String mensagem;

    @Override
    public void enviar(String destino, String mensagem) {

        System.out.println(destino + mensagem);
    }

    public EmailNotificador() {

    }
}
