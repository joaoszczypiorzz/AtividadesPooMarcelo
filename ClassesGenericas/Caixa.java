package ClassesGenericas;

public class Caixa<T> {
    private T item;

    //constructor
    public Caixa (T item){
        this.item = item;
    }

    //Métodos deste classe:
    public void guardar(T item){

    }

    public T obter(){
        return item;
    }

    public boolean estaVazia(T item){
        if(item != null){
            System.out.println("Caixa possui Itens armazenados!");
            return false;
        }

        System.out.println("Caixa está vazia!");
        return true;
    }

    //getters e setter
    public T getItem() {
        return item;
    }

    public T setItem(T item) {
        this.item = item;
        return (T) this;
    }
}
