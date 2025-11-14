package Atividade11_SistemaLojaDeLivros;

import Listas.Produto;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>(); //instanciando Lista para armazenar os Livros

        //adicionando livros na Lista:
        livros.add(new Livro("Java Essencial","Deitel",89.90));
        livros.add(new Livro("Algoritmos e Estruturas","Cormen", 120.00));
        livros.add(new Livro("Programação em Python","Nilo Ney", 49.90));
        livros.add(new Livro("Banco de dados","Silberschatz", 80.00));
        livros.add(new Livro("Lógica de Programação" , "Forbellone", 55.00));

        //falta apenas utilizar as Lambdas para os fitros e etc:
        /*
            3)_Utilizando Lambdas e Streams, o programa deve:
            Exibir todos os livros disponíveis (usando forEach);
            Mostrar apenas os livros com preço acima de R$ 50,00 (filter);
            Exibir apenas os títulos em maiúsculo (map);
            Calcular e mostrar o preço médio dos livros (mapToDouble().average()).
            4)_Ordenar a lista de livros pelo preço (do menor para o maior) usando Comparator e Lambda.
            5)_Exibir o livro mais caro e o mais barato utilizando max() e min() com expressões lambda.

        * */






    }
}
