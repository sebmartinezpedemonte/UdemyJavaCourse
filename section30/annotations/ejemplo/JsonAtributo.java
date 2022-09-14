package section30.annotations.ejemplo;

import java.lang.annotation.*;

@Documented //para agregarlo al API doc
@Target(ElementType.FIELD) //esta anotacion se va a aplicar sobre atributos
@Retention(RetentionPolicy.RUNTIME) //se va a aplicar en el tiempo de ejecucion (lo mas tipico)

public @interface JsonAtributo {
    //las anotaciones siempre se escriben con @
    String nombre() default "";
    //el tipo de dato se define como un metodo
    //podemos agregarle un valor por defecto

    //generamos otro atributo para capitalizar, para obtener el nombre o cualquier otro atributo de la clase
    //y queremos convertir a mayuscula la primera letra o incluso cada letra
    boolean capitalizar() default false;
}
