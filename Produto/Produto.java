package Produto;

public class Produto {
        private int codProduto;
        private String nome;
        private double preco;

        //Constructor da Classe, Obrigando a instanciar o Produto com o seu código, nome e preço
        public Produto(int codProduto, String nome, double preco){
            this.codProduto = codProduto;
            this.nome =  nome;
            this.preco = preco;
        }

    //getters e setters
    public int getCodProduto(){
        return codProduto;
    }

    public Produto setCodProduto(int codProduto){
        this.codProduto = codProduto;
        return this;
    }

    public String getNome(){
        return nome;
    }

    public Produto setNome(String nome){
        this.nome = nome;
        return this;
    }

    public double getPreco(){
        return preco;
    }

    public Produto setPreco(double preco){
        this.preco = preco;
        return this;
    }
}
