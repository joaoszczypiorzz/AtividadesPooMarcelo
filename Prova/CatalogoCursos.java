package Prova;

import java.util.ArrayList;
import java.util.List;

public class CatalogoCursos <T extends Curso>{
    private List<T> lista;


    List<T> getCursos(){
        return lista;
    }



    public CatalogoCursos(){
        this.lista = new ArrayList<>();
    }

    public void adicionar(T Curso){
        lista.add(Curso);
    }

    public T buscarPorCodigo(int codigo) {
        return lista.stream()
                .filter(p -> p.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    // Listar todos os produtos
    public void listarCursos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum Curso cadastrado!");
        } else {
            for (T produto : lista) {
                System.out.println(produto);
            }


        }
    }


}
