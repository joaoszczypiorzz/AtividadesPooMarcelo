package EmailMessage;

public class EmailNotificador implements Notificador{


    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Para: " + destino + "\n" + "Mensagem: " + mensagem);
    }


}
