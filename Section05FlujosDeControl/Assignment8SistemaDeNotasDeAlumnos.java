package Section05FlujosDeControl;/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
 ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de
error finalizando el programa.
 */

import java.util.Scanner;

public class Assignment8SistemaDeNotasDeAlumnos {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        double nota;
        final int NOTAS_TOTALES = 20;
        double promedioNotasMayoresACinco;
        int SumaNotasMayoresCinco = 0;
        int cantNotasMayoresCinco = 0;
        double promedioNotasInferioresACuatro;
        int cantNotasMenoresCuatro = 0;
        int SumaNotasMenoresCuatro = 0;
        int cantidadNotasUno = 0;
        double promedioTotal;
        int sumaTodasNotas = 0;

        System.out.println("Ingrese 20 notas finales de alumnos en una escala de 1 a 7");

        for (int i = 1; i <= NOTAS_TOTALES; i++) {
            System.out.println("Ingrese la nota " + i);
            nota = input.nextInt();

            while (!(nota >= 0 && nota <= 7)) {
                System.out.println("Error, la nota debe estar entre 1 y 7.");
                System.out.println("Ingrese la nota " + i);
                nota = input.nextInt();
            }
            sumaTodasNotas += nota;
            if (nota > 5) {
                cantNotasMayoresCinco++;
                SumaNotasMayoresCinco += nota;
            } else if (nota < 4 && nota > 1) {
                cantNotasMenoresCuatro++;
                SumaNotasMenoresCuatro += nota;
            } else if (nota == 1) {
                cantidadNotasUno++;
            } else if (nota == 0) {
                System.out.println("Error");
                break;
            }
        }
        promedioNotasMayoresACinco = (double) SumaNotasMayoresCinco / cantNotasMayoresCinco;
        promedioNotasInferioresACuatro = (double) SumaNotasMenoresCuatro / cantNotasMenoresCuatro;
        promedioTotal = (double) sumaTodasNotas / NOTAS_TOTALES;

        System.out.println("promedioNotasMayoresACinco = " + promedioNotasMayoresACinco);
        System.out.println("promedioNotasInferioresACuatro = " + promedioNotasInferioresACuatro);
        System.out.println("cantidadNotasUno = " + cantidadNotasUno);
        System.out.println("promedioTotal = " + promedioTotal);

        input.close();
    }
}
