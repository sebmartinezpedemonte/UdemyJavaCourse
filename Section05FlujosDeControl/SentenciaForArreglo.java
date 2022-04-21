package Section05FlujosDeControl;

import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //String[] nombres = new String[8]; o tmb String nombres[] =
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equals("Andres")||
                    nombres[i].equals("Pepa")){ //o  nombres[i].contains("Pepa")
                continue;
            }
            if(nombres[i].equalsIgnoreCase("pepe")){
                continue;
            }
            if(nombres[i].toLowerCase().contains("BEA".toLowerCase())){
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for(int i = 0; i < count ; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");

        }
    }
}
