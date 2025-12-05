package Prova;

/**
 * Esta classe tem como função Representar um Curso presencial, e ela herda os atributos de sua classe pai,
 * Pois ela é um acima de tudo um Curso, mas do tipo presencial, nela implemento meus estudos sobre Herença e polimorfismo
 * @author João Szczypior
 * @version 1.0.0
 */

public class CursoPresencial extends Curso {
    private int cargaHoraria;

    //Getters e setters:
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public CursoPresencial setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
        return this;
    }
    //constructor
    public CursoPresencial(String codigo, String titulo, double valorBase, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        super(codigo, titulo, valorBase);
    }

    /**
     * Esta funcção tem como objetivo aplicar desconto a um curso presencial
     * Ela Sobreescreve o método de sua classe pai de acordo com a sua implementação adequeada para a classe
     * @param percentual Percentual de desconto informado pelo meu usuário
     */
    @Override
    void aplicarDesconto(double percentual) {
        if(percentual > 20){
            System.out.println("Percentual não deve ser maior que 20%");
            return;
        }
        valorBase = valorBase - (valorBase * percentual/100) ; //aplicando
    }

    /**
     * toString padrão para facilitar a visualização dos dados durante o debug do Código e para retornar as informações
     * Da classe ao meu usuário também, caso for preciso
     * @return retonar os valores Dos objetos inicializaados
     */
    @Override
    public String toString() {
        return "[PRESENCIAL] " +
                " [" + codigo +"]" +
                " - " + titulo +
                " -  Valor Base: R$ " + valorBase +
                "(Carga Horária: " + cargaHoraria +" horas)";
    }

}
