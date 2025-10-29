package EmailMessage;

public class SmsNotificador implements Notificador{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Para: " + destino + "\n" + "Mensagem: " + mensagem);
    }


}
