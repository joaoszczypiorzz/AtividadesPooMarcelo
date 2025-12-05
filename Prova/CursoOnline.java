package Prova;

/**
 * Esta classe é a representação dos cursos Online, ela inclui suas informações especificas ( Plataforma e Material Extra )
 * Ela é uma classe filha da Classe Curso, por isso sobreescreve seus métodos e possui acesso ao super
 * Com essa classe pude implementar de forma prática meus estudos acerca dos conceitos de Herança multipla e polimorfismo em Java
 * @author João Szczypior
 * @version 1.0.0
 */
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

    /**
     * Esta função tem como objetivo aplicar desconto a algum curso do catálogo,
     * Ela sobreescreve o método de sua classe pai, de acordo com as regras de desconto para cursos Online
     * @param percentual Representa o percentual de desconto a ser aplicado, informado por inputs do meu usuário
     */
    @Override
    void aplicarDesconto(double percentual) {
        if(percentual > 50){
            System.out.println("Percentual de desconto deve ser menor que 50%");
            return;
        }
        valorBase = valorBase - (valorBase * percentual/100);
    }

    /**
     * toString padrão para facilitar a visualização dos dados da classe no debug e caso nescessário imprimir os dados ao usuário na tela
     * @return retornar o estado atual dos Objetos
     */
    @Override
    public String toString() {
        return "[ONLINE] " +
                " [" + codigo +"]" +
                " - " + titulo +
                " -  Valor Base: R$ " + valorBase +
                "(Plataforma: " + plataforma +"," + materialExtra +")";
    }
}
