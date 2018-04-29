package games.medrick.medrickestan.api.plugin.annotation;

import java.lang.annotation.*;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authorization {
    boolean value() default true;
}
