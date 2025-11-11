package ClassesGenericas;

public class Caixa<T> {
    private T item;

    //Métodos deste classe:
    public void guardar(T item){

    }

    public T obter(){
        return item;
    }

    public boolean estaVazia(){
        return true;
    }

    public T getItem() {
        return item;
    }

    public T setItem(T item) {
        this.item = item;
        return (T) this;
    }
}
