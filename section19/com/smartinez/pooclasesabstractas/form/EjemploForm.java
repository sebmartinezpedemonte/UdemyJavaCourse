package section19.com.smartinez.pooclasesabstractas.form;

import section19.com.smartinez.pooclasesabstractas.form.elementos.*;
import section19.com.smartinez.pooclasesabstractas.form.elementos.select.Opcion;
import section19.com.smartinez.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        //Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(new Opcion("1", "Java"))
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion(new Opcion("4", "TypeScript").setSelected())
        .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado!");
        username.setValor("");
        password.setValor("a1b2c");
        email.setValor("john.doecorreo.com");
        edad.setValor("28l");
        experiencia.setValor("... mas de 10 años de experiencia ...");
        //java.setSelected(true);
        /*
        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        */
        //o usamos Arrays.asList
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        /*
        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }
        */ //o se puede hacer esto utilizando Stream con expresion lambda
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){      //System.out::println = err -> System.out.println(err)
                e.getErrores().forEach(System.out::println); //si es una sola sentencia puedo evitar usar las llaves
            }                           //System.out::println metodo de referencia o referenciado en una expresion lambda
        });


    }
}