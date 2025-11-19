package Prova;

public abstract class Curso implements Inscrevivel {
    protected int codigo;
    protected String titulo;
    protected double valorBase;

    //Constructor da classe:
    public Curso(int codigo, String titulo, double valorBase){
        this.codigo = codigo;
        this.titulo = titulo;
        this.valorBase = valorBase;
    }


    //getters e setters:
    public int getCodigo(){
        return codigo;
    }

    public Curso setCodigo(int codigo){
        this.codigo = codigo;
        return this;
    }

    public double getValorBase(){
        return valorBase;
    }

    public Curso setValorBase(double valorBase){
        this.valorBase = valorBase;
        return this;
    }

    public String getTitulo(){
        return titulo;
    }

    public Curso setTitulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    //Metodo abstrado para ser implementado de forma diferente em cada subclasse:
    abstract void aplicarDisconto(double percentual);

    @Override
    public double calcularValorTotal(int quantidade) {
        return valorBase*quantidade;
    }

    @Override
    public void inscrever(int quantidade) {
        System.out.println("A quantidade é: " + quantidade + "\nValor total: " + calcularValorTotal(quantidade));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
