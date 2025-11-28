package Prova;

public class CursoOnline extends  Curso{
    private String plataforma;
    private boolean materialExtra;

    public String getPlataforma(){
        return plataforma;
    }
    public CursoOnline setPlataforma(String plataforma){
        this.plataforma = plataforma;
        return this;
    }

    public boolean getMaterialExtra(){
        return materialExtra;
    }

    public CursoOnline setMaterialExtra(boolean materialExtra){
        this.materialExtra = materialExtra;
        return this;
    }

    public CursoOnline(String codigo, String titulo, double valorBase, String plataforma, boolean materialExtra) {
        this.plataforma = plataforma;
        this.materialExtra = materialExtra;
        super(codigo, titulo, valorBase);
    }

    @Override
    void aplicarDesconto(double percentual) {
        if(percentual > 50){
            System.out.println("Percentual de desconto deve ser menor que 50%");
            return;
        }
        valorBase = valorBase - (valorBase * percentual/100);
    }

    @Override
    public String toString() {
        return "[ONLINE] " +
                " [" + codigo +"]" +
                " - " + titulo +
                " -  Valor Base: R$ " + valorBase +
                "(Plataforma: " + plataforma +"," + materialExtra +")";
    }
}
