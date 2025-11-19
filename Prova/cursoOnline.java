package Prova;

public class cursoOnline extends  Curso{
    private String plataforma;
    private boolean materialExtra;

    public String getPlataforma(){
        return plataforma;
    }
    public cursoOnline setPlataforma(String plataforma){
        this.plataforma = plataforma;
        return this;
    }

    public boolean getMaterialExtra(){
        return materialExtra;
    }

    public cursoOnline setMaterialExtra(boolean materialExtra){
        this.materialExtra = materialExtra;
        return this;
    }

    public cursoOnline(String codigo, String titulo, double valorBase, String plataforma, boolean materialExtra) {
        this.plataforma = plataforma;
        this.materialExtra = materialExtra;
        super(Integer.parseInt(codigo), titulo, valorBase);
    }

    @Override
    void aplicarDisconto(double percentual) {
        if(percentual > 50){
            System.out.println("Percentual de desconto deve ser menor que 50%");
            return;
        }
        valorBase = valorBase *valorBase/percentual;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
