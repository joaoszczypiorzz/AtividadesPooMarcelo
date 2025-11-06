package Produto;
import java.util.ArrayList;
import java.util.List;

public class Repositorio<T extends Produto> {
    private List<T> lista;

    public Repositorio(List<T> lista){
        this.lista = new ArrayList<>();
    }

    public void adicionar(T produto){
        lista.add(produto);
    }

    public T buscarMaiorPreco(){
        T produtoMaisCaro = lista.get(0);
        for (T produto: lista){
            if(produto.getPreco() < produtoMaisCaro.getPreco()){
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public T BuscarMenorPreco(){
        T produtoMaisBarato = lista.get(0);
        for (T produto: lista){
            if(produtoMaisBarato.getPreco() < produto.getPreco()){
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

}
