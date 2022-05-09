package Section03TipoStringCadenas;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 =>4 ms, 10000 => 105 ms, 100000 => 5071 ms
            //c += a + b + "\n"; //500 => 19 ms, 1000 => 21ms, 10000 => 68 ms, 100000 =>1976 ms    ; c = c + a + b +"\n"
            sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 0ms, 10000 => 2 ms, 100000 => 8 ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
