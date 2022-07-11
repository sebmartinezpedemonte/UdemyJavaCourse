package section12.arrays;

public class EjemploArreglosCombinadosBis {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        for (int i = 0 ; i < a.length;
        i++){
            a[i] = i + 1; //del 1 al 10
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5; //multiplos de 5
        }
        int aux = 0;
        for(int i = 0; i <a.length; i+=3){
           for(int j = 0; j < 3; j++){
               c[aux++] = a[i+j];
           }
            for(int j = 0; j < 3; j++) {
                c[aux++] = b[i+j];
            }
        }
        //mostrar datos de c[]
        for(int i = 0; i < c.length;i++){
            System.out.println(i + ": " + c[i]);
        }

    }
}
