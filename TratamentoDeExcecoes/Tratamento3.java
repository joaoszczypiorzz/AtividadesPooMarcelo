package TratamentoDeExcecoes;

public class Tratamento3 {
    public static void main(String[] args) {
        double preco = -1;

        try{
            if(preco < 0){
                System.out.println("Valor não pode ser negativo!");
                throw new IllegalAccessException("Sistema Travou!");
            }
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
