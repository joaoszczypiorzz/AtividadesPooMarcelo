package Atividade11_SistemaLojaDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    //Constructor da Classe Livro:
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    //getters e setters da Classe Livro:
    public String getTitulo(){
        return titulo;
    }
    public Livro setTitulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    public String getAutor(){
        return autor;
    }

    public Livro setAutor(String autor){
        this.autor = autor;
        return this;
    }

    public double getPreco(){
        return preco;
    }

    public Livro setPreco(double preco){
        this.preco =  preco;
        return this;
    }
}

