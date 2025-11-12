package Lambdas;

interface OperacaoMatematica{
    public int calcular(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new OperacaoMatematica(){
            @Override
            public int calcular(int a, int b) {
                return a + b ;
            }
        };

        System.out.println("Soma sem função Lambda: " + soma.calcular(10,10));

        //execução com uso de Lambda:
        OperacaoMatematica somaFl =((a, b) -> a + b);
        System.out.println("SomaFL com função Lambda: " + somaFl.calcular(10,10));
    }
}
