package ClassesGenericas;

public class Main {
    public static void main(String[] args) {

        //Instanciando as classes genericas:
        Caixa<String> texto = new Caixa<>(null);
        Caixa<Integer> inteiro = new Caixa<>(null);

        //Demonstração de caixa vazia usando o metodo estaVazia():
        System.out.println("Demonstração com Caixa Vazia:");
        System.out.println(texto.estaVazia(texto.getItem()));
        System.out.println(inteiro.estaVazia(inteiro.getItem()));
        System.out.println("-----------------------------------------");

        inteiro.setItem(1); //incluindo um num inteiro na caixa dos inteios
        texto.setItem("Hello word!"); //incluindo um String na caixa dos textos


        //demonstração de caixa com itens usando o Metodo estaVazia():
        System.out.println("Demonstração de caixa com Itens: ");
        System.out.println(texto.estaVazia(texto.getItem()));
        System.out.println(inteiro.estaVazia(inteiro.obter()));




    }
}
