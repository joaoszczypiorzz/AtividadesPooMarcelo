package Lambdas;

interface manipuladorString{
    String manipulador(String string);
}

public class Main2 {
    public static void main(String[] args) {

        manipuladorString maiuscula =  new manipuladorString() {
            @Override
            public String manipulador(String string) {
                return string.toUpperCase();
            }
        };

        //execução sem Lambda:
        System.out.println("Manipular sem Lambda: " + maiuscula.manipulador("unifilista"));

        //execução com Lambda:
        manipuladorString maiusculaFL = (maiscula) -> maiscula.toUpperCase();
        System.out.println("Manipulador com Lambda: " + maiusculaFL.manipulador("unifilista olá"));





    }
}
