package Prova;

import java.sql.SQLOutput;
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

    //Buscar produto por código:
    public T buscarPorCodigo(String codigo){
        return lista.stream()
                .filter(c -> c.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Curso não encontrada " + codigo)); //mandando exceção de erro para curso não encontrado
    }

    //Listar todos os produtos
    public void listarCursos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum Curso cadastrado!");
        } else {
            for(T cursos : lista){
                System.out.println(cursos);
            }
        }
    }


}
