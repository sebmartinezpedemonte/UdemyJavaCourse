package section22.com.smartinezgenerics.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal) a).getNombre() + " tipo: " + ((Animal) a).getTipo());
            }else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria) a).getTipo());
            }else if(a instanceof Automovil){
                System.out.println(((Automovil) a).getMarca());
            }
        }

    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);


        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);

        /*
        for(Automovil a : transAuto){
            System.out.println(a.getMarca());
        }
        */

    }
}
