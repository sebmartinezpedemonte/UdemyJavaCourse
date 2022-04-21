package Section06Wrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        //autoboxing:
        //convirtiendo primitivos en la literal en tipos de referencia
        //forma explicita (1)
        //forma implicita (el resto)
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,
                9,10,11,12,13,14,15};

        int suma = 0;

        //forma explicita
        for(Integer i: enteros){
            if(i.intValue() % 2 ==0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        suma = 0;
        //forma implicita
        for(Integer i: enteros){
            if(i % 2 ==0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);


    }
}
