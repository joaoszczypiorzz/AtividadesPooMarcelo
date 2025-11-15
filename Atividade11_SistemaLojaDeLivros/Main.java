package Atividade11_SistemaLojaDeLivros;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>(); //instanciando Lista para armazenar os Livros

        //adicionando livros na Lista:
        livros.add(new Livro("Java Essencial","Deitel",89.90));
        livros.add(new Livro("Algoritmos e Estruturas","Cormen", 120.00));
        livros.add(new Livro("Programação em Python","Nilo Ney", 49.90));
        livros.add(new Livro("Banco de dados","Silberschatz", 80.00));
        livros.add(new Livro("Lógica de Programação" , "Forbellone", 55.00));

        //exibindo Lista de livros cadastrados com Lambda:
        System.out.println("Lista de Livros: ");
        livros.forEach(l ->
            System.out.printf("Livros: %s  | Autor: %s  | Preço: R$%.2f%n",
                    l.getTitulo(), l.getAutor(), l.getPreco()));

        //Mostrar apenas os livros com preço acima de R$ 50,00
        System.out.println("------------------------------------------------------------------------");
        System.out.println("===Livros Com preço acima de R$ 50,00 ( Usando Lambda )===");
        livros.stream()
                .filter(livro -> livro.getPreco() >= 50.00)
                .forEach(livro ->
                                System.out.printf("Nome do Livro: %s  | Autor: %s  | Preço: R$%.2f%n",
                                        livro.getTitulo(), livro.getAutor(), livro.getPreco())
                        );

        //Mostrar os Titulos dos Livros Todos com Letras maiusculas usando Lambda .map()
        System.out.println("------------------------------------------------------------------------");
        System.out.println("===Títulos dos Livros cadastrados em Maiusculo ( Usando Lambda )===");
        livros.stream()
                .map(livro -> livro.getTitulo().toUpperCase())
                .forEach(livro -> System.out.println(livro));

        //Usando lambdas para Aplicar filtros de Estatísticas
        System.out.println("------------------------------------------------------------------------");
        System.out.println("==ESTATÍSTICAS==");
        double media = livros.stream()     //O livros.stream é como se eu tivesse basicamente abrindo o array livros
                .mapToDouble(livro -> livro.getPreco())  //Pega apenas os preços de todos os livros cadastrados no array livros
                .average() //faz a media deles average em Portugues = média
                .orElse(0.0); //caso os preços não existirem no array ele pega 0.0
        System.out.printf("A média dos preços dos livros é: R$%.2f%n", media); //imprimindo a média para meu usuário na tela
        System.out.println("------------------------------------------------------------------------");

        //Ordenando os Livros em ordem Crescente:
        System.out.println("Ordenando Livros pelos preços em ordem crescente: ");
        livros.stream()
                .sorted(Comparator.comparing(Livro::getPreco))
                .forEach(livro ->
                        System.out.printf("Nome do Livro: %s  | Autor: %s  | Preço: R$%.2f%n",
                                livro.getTitulo(), livro.getAutor(), livro.getPreco())
                );
        System.out.println("------------------------------------------------------------------------");

        //Exibindo Livro mais caro e o mais Barato
        livros.stream()
                .max(Comparator.comparing(Livro::getPreco))
                .ifPresent(livro ->
                                System.out.printf("Livro com maior Preço é: %s | Autor: %s  | Preço: R$%.2f%n",
                                        livro.getTitulo(), livro.getAutor(), livro.getPreco())
                        );

        livros.stream()
                .min(Comparator.comparing(Livro::getPreco))
                .ifPresent(livro ->
                                System.out.printf("Livro com menor Preço é: %s | Autor: %s  | Preço: R$%.2f%n",
                                        livro.getTitulo(), livro.getAutor(), livro.getPreco())
                        );

    }
}
