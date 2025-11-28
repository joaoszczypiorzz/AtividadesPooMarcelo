package Prova;


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

    @Override
    void aplicarDesconto(double percentual) {
        if(percentual > 20){
            System.out.println("Percentual não deve ser maior que 20%");
            return;
        }
        valorBase = valorBase - (valorBase * percentual/100) ; //aplicando
    }

    @Override
    public String toString() {
        return "[PRESENCIAL] " +
                " [" + codigo +"]" +
                " - " + titulo +
                " -  Valor Base: R$ " + valorBase +
                "(Carga Horária: " + cargaHoraria +" horas)";
    }

}
