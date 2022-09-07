package section30.annotations.ejemplo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    //las anotaciones siempre se escriben con @
    String nombre() default "";

}
