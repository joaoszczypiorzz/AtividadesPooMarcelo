package TratamentoDeExcecoes;

public class Tratamento2 {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5};

        try {
            int x = v[6];
            System.out.println(x);
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
