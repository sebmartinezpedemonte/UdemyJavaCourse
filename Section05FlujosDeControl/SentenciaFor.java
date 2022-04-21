package Section05FlujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){ //5 iteraciones
            System.out.println("i = " + i);
        }

        System.out.println("-----------------------");
        System.out.println("Otra manera");
        int i = 0;
        for(; ;){

            if(i >= 5){
                break;
            }
            System.out.println("i = " + i);

            i++;
        }
        System.out.println("-------------------");
        for(int j = 10; j >= 0; j--){
            System.out.println("j = " + j);
        }

        for(int j = 1, k = 10; j < k; j++, k--){
            System.out.println(j + "-" + k);
        }
        for(int j = 0; j <= 10; j++){ //5 iteraciones
            if( !(j % 2 == 0) ){
                continue;
            }
            System.out.println("j = " + j);
        }



    }
}
