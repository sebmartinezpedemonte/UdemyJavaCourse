package section22.com.smartinezgenerics.assignment26;




public class EjemploSupermercado {
    public static void main(String[] args) {
        /*
            protected String nombre;
            protected Double precio;

            private int cantidad;
            private int proteinas;
               Para el ejemplo de la clase main se  pide crear un objeto bolsa para cada tipo
    de producto con 5 elementos, se debe mostrar por cada bolsa el detalle completo
     de sus elementos, el precio, nombre y los atributos adicionales sin realizar
      cast de ningún tipo, ni toString().
         */

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProductos(new Lacteo("Yogur", 140.50, 1, 100));
        bolsaLacteos.addProductos(new Lacteo("Leche", 560.5, 2, 50));
        bolsaLacteos.addProductos(new Lacteo("Queso", 600.3, 1, 200));
        bolsaLacteos.addProductos(new Lacteo("Manteca", 300.0, 1, 50));
        bolsaLacteos.addProductos(new Lacteo("Dulce de leche", 450.5, 3, 50));

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        bolsaFruta.addProductos(new Fruta("Manzana", 200.0, 1.0, "Verde"));
        bolsaFruta.addProductos(new Fruta("Banana", 150.9, 1.1, "Amarrillo"));
        bolsaFruta.addProductos(new Fruta("Kiwi", 1600.9, 2.1, "Verde"));
        bolsaFruta.addProductos(new Fruta("Pera", 200.3, 1.2, "Verde"));
        bolsaFruta.addProductos(new Fruta("Uva", 120.0, 0.5, "Violeta"));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProductos(new Limpieza("Ayudin", 300.4, "Lavandina", 2.0));
        bolsaLimpieza.addProductos(new Limpieza("Seizeme", 150.0, "Jabon", 0.5));
        bolsaLimpieza.addProductos(new Limpieza("Magistral", 190.5, "Detergente", 0.2));
        bolsaLimpieza.addProductos(new Limpieza("Colgate", 230.3, "Pasta de dientes", 0.1));
        bolsaLimpieza.addProductos(new Limpieza("Zif", 300.0, "Acido", 0.5));

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.addProductos(new NoPerecible("Harina", 50.5, 100, 300));
        bolsaNoPerecible.addProductos(new NoPerecible("Atun", 200.0, 1, 200));
        bolsaNoPerecible.addProductos(new NoPerecible("Arvejas", 100.5, 2, 100));
        bolsaNoPerecible.addProductos(new NoPerecible("Galletas", 59.5, 10, 1000));
        bolsaNoPerecible.addProductos(new NoPerecible("Arroz", 30.5, 1, 500));


        System.out.println("-------------------------------- Frutas ---------------------------------");
        for (Fruta fruta : bolsaFruta.getProductos()) {
            System.out.println("-------------------------------- " +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso : " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaLimpieza.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad : " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaNoPerecible.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias : " + prod.getCalorias());
            System.out.println("Contenido: " + prod.getContenido());
        }

        //con cast
        mostrarDetalle(bolsaLacteos);
        mostrarDetalle(bolsaFruta);
        mostrarDetalle(bolsaLimpieza);
        mostrarDetalle(bolsaNoPerecible);

    }
    //con cast
    public static <T> void mostrarDetalle(BolsaSupermercado<T> producto) {
        for (T a : producto)
            if (a instanceof Producto) {
                System.out.println("Nombre: " + ((Producto) a).getNombre());
                System.out.println("Precio: " + ((Producto) a).getPrecio());
                if (a instanceof Lacteo) {
                    System.out.println("Cantidad: " + ((Lacteo) a).getCantidad());
                    System.out.println("Proteinas: " + ((Lacteo) a).getProteinas());
                }else if(a instanceof Fruta){
                    System.out.println("Peso: " + ((Fruta)a).getPeso());
                    System.out.println("Color: " + ((Fruta)a).getColor());
                }else if(a instanceof Limpieza){
                    System.out.println("Componentes: " + ((Limpieza)a).getComponentes());
                    System.out.println("Litros: " + ((Limpieza)a).getLitros());
                }else if(a instanceof NoPerecible){
                    System.out.println("Calorias: " + ((NoPerecible)a).getCalorias());
                    System.out.println("Contenido: " + ((NoPerecible)a).getContenido());
                }
                System.out.println("==================");
            }

    }



}
