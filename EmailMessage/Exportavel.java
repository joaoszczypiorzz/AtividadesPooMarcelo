package EmailMessage;

public interface Exportavel {

    String exportar();
    default String cabecalho(){
        return "---EXPORT---";
    }



}
