package Prova;


import java.util.ArrayList;
import java.util.List;

/**
 *Esta é uma classe genérica onde basicamente ficam todos os cursos cadastrados (funcionando como um catálogo)
 * Mais especificamente eles ficam dentro do List <T>, Além de armazenar os cursos essa classe também realiza todos os processos
 * De adicionar/Listar/buscar pelo código/verificar existencia dos cursos cadastrados
 * @author João Szczypior
 * @version 1.0.0
 */

public class CatalogoCursos <T extends Curso>{
    private List<T> lista;


    List<T> getCursos(){
        return lista;
    }


    //Constructor da Classe
    public CatalogoCursos(){
        this.lista = new ArrayList<>();
    }

    /**
     * Esta função apenas adiciona os cursos na Lista/catálogo
     * @param Curso Representa o objeto curso que vem já com seus construtores, ou seja, seus dados preenchidos
     */
    public void adicionar(T Curso){
        lista.add(Curso);
    }


    /**
     * Esta função tem como objetivo buscar dentro do List, o código informado pelo meu usuário, utilizando uma lambida para isso
     * @param codigo Representa o código informado pelo meu usuário a qual o método deve procurar dentro da List
     * @return Retorna uma lambida de procura pelo código, que caso o código não seja encontrado lança Throw
     */
    public T buscarPorCodigo(String codigo){
        return lista.stream()
                .filter(c -> c.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Curso " + codigo + " não encontrado!")); //mandando exceção de erro para curso não encontrado
    }

    /**
     *Método para Listar os cursos cadastrados dentro da List ao usuário na tela
     */
    public void listarCursos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum Curso cadastrado!");
        } else {
            for(T cursos : lista){
                System.out.println(cursos);
            }
        }
    }

    /**
     * Este método tem como função verificar se o Novo código informado pelo usuário já foi cadastrado ou não no List,
     * Faço essa verificação, pois não podem existir dentro do List dois cursos com mesmo código, então sempre que tiver que
     * implementar essa função caso ela retorne algo diferente de Null, deve lançar um erro ao usuário
     * @param codigoNovo Representa o novo código informado pelo meu usuário no cadastro de um novo curso
     * @return Retorna uma lambda que faz a busca pelo código informado pelo meu usário
     */
    public T verifiarExiste(String codigoNovo){
        return lista.stream()
                .filter(c -> c.getCodigo().equalsIgnoreCase(codigoNovo))
                .findFirst()
                .orElse(null);
    }


}
