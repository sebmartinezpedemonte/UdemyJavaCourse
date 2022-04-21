package Section02Variables;

import java.util.Scanner;

public class SistemasNumericos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
