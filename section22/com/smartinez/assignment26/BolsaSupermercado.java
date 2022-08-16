package section22.com.smartinez.assignment26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BolsaSupermercado<T> implements Iterable<T>{

    private List<T> objetos;

    private final int MAX_ELEMENTOS = 5;

    public BolsaSupermercado(){
        this.objetos = new ArrayList<>();
    }

    public void addProductos(T objeto){
        if(this.objetos.size()<=MAX_ELEMENTOS){
            this.objetos.add(objeto);
        }else{
            System.out.println("La bolsa esta llena");
        }
    }

    public List<T> getProductos() {
        return objetos;
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
