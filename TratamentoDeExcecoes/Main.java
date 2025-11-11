package TratamentoDeExcecoes;

public class Main {
    public static void main(String[] args) {
        String texto = "10";

        try {
            int valor = Integer.parseInt(texto);

            System.out.println(valor + 10);
        }catch (NumberFormatException e ){
            System.out.println(e);
            System.out.println("Você digitou um valor inválido!");

        }finally {
            System.out.println("Fim do Programa!");
        }


    }
}
