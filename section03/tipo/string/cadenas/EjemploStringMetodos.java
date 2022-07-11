package section03.tipo.string.cadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length() - 2)) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        //Si es menor a 0 significa que no lo encontro
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        //sirve para formularios
        System.out.println("  trabalenguas  ".trim());




    }
}
