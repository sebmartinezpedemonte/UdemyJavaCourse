package section32.patronesdedisenio.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
    //busqueda recursiva con el patron composite
    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }
    //para poder encadenar adds
    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c){
        hijos.remove(c);
    }


    @Override
    public String mostrar(int nivel) { //recorrer el arbol completo de los directorios
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(getNombre())
                .append("/")
                .append("\n");
        for(Componente hijo : hijos){
            sb.append(hijo.mostrar(nivel + 1));
            if(hijo instanceof Archivo){
                    sb.append("\n");
            }
        }
        return sb.toString();
    }
    //busqueda recursiva con el patron composite
    @Override
    public boolean buscar(String nombre) {
        boolean seEncontro = false;
        if(this.getNombre().equalsIgnoreCase(nombre)){
            seEncontro = true;
        }else {
            seEncontro = hijos.stream().anyMatch(h -> h.buscar(nombre));

            /*for (Componente hijo : hijos){
                if(hijo.buscar(nombre)){
                    seEncontro = true;
                }
            }
             */


        }
        return seEncontro;
    }
}
