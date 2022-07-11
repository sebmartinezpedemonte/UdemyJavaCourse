package section12.arrays;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0 ; i < a.length;
        i++){
            a[i] = i + 1; //del 1 al 10
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5; //multiplos de 5
        }
        int aux = 0;    //aux++ posincremento, se incrementa despues.
        // Primero se asigna cero y despues se incrementa
        for(int i = 0; i <10 ; i++){ //o i< a.length o i < b.length
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        //mostrar datos de c[]
        for(int i = 0; i < c.length;i++){
            System.out.println(i + ": " + c[i]);
        }

    }
}
