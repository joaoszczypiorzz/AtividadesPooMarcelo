package Prova;

/**
 * Classe abstrata Pai, que tem como função ser a base para todo e qualquer Curso, sendo ele presencial ou Online
 * Esta classe por ser abstrata possui alguns métodos abstratos que devem ser implantados de acordo com as regras de negócios das classes filhas,
 * Ela implementa a Interface Inscrevivel, logo é obrigada a implementar seus métodos
 * @author João Szczypior
 * @version 1.0.0
 */
public abstract class Curso implements Inscrevivel {
    protected String codigo;
    protected String titulo;
    protected double valorBase;

    //Constructor da classe:
    public Curso(String codigo, String titulo, double valorBase){
        this.codigo = codigo;
        this.titulo = titulo;
        this.valorBase = valorBase;
    }


    //getters e setters:
    public String getCodigo(){
        return codigo;
    }

    public Curso setCodigo(String codigo){
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
    abstract void aplicarDesconto(double percentual);

    @Override
    public double calcularValorTotal(int quantidade) {
        return valorBase*quantidade;
    }

    @Override
    public void inscrever(int quantidade) {
        System.out.printf("Quantidade de Alunos Inscritos no curso: %d%nValor total: R$%.2f%n",
                quantidade, calcularValorTotal(quantidade)
        );
    }

    //To String para retornar informações do Objeto em formato de String
    @Override
    public String toString() {
        return String.format("Código: %s  | Titulo: %s  | Valor Base: R$%.2f%n",
                codigo, titulo , valorBase);
    }
}
