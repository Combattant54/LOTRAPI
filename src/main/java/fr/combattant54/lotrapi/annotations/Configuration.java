package fr.combattant54.lotrapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Configuration {
    ConfigurationBasic config();

    IntValue[] configValues() default {};

    Timer[] timers() default {};

    ConfigurationBasic[] configurations() default {};
}