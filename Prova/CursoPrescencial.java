package Prova;

public class CursoPrescencial extends Curso {
    private int cargaHoraria;

    //Getters e setters:
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public CursoPrescencial setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
        return this;
    }
    //constructor
    public CursoPrescencial(String codigo, String titulo, double valorBase, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        super(Integer.parseInt(codigo), titulo, valorBase);
    }

    @Override
    void aplicarDisconto(double percentual) {
        if(percentual > 20){
            System.out.println("Percentual não deve ser maior que 20%");
            return;
        }
        valorBase = valorBase *valorBase /percentual; //aplicando
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
