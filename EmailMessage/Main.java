package EmailMessage;

public class Main {
    public static void main(String[] args) {

        RelatorioService relatorioEmail = new RelatorioService(new EmailNotificador(), new RelatorioVendas());
        relatorioEmail.gerarEEnviar("joaoszczypior@gmail.com");
        System.out.println("================================================");

        RelatorioService relatorioSms = new RelatorioService(new SmsNotificador(), new RelatorioEstoque());
        relatorioSms.gerarEEnviar("+55 9 91367390");


    }
}
