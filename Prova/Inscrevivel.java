package Prova;

/**
 * Interface para obrigar as classes que o implementarem a herdarem esse métodos, tornando eles obrigatorios as classes
 * @author João Szczypior
 *
 */
public interface Inscrevivel {

    double calcularValorTotal(int quantidade);
    void inscrever(int quantidade);
}
