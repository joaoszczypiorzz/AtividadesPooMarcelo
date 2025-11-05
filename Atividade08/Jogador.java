package Atividade08;

public class Jogador {
    private String nome;
    private double salario;
    private int camisa;

    public Jogador(String nome, double salario, int camisa){
        this.nome = nome;
        this.camisa = camisa;
        this.salario = salario;
    }

    //Getters e Setters da classe
    public String getNome(){
        return nome;
    }
    public Jogador setNome(String nome){
        this.nome = nome;
        return this;
    }

    public double getSalario(){
        return salario;
    }
    public Jogador setSalario(double salario){
        this.salario = salario;
        return this;
    }

    public int getCamisa(){
        return camisa;
    }
    public Jogador setCamisa(int camisa){
        this.camisa = camisa;
        return this;
    }

}
