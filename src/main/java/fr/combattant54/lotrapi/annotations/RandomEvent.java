package fr.combattant54.lotrapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RandomEvent {

    String key();

    String[] loreKey() default {};

    int defaultValue() default 1;

    int meetUpValue() default 1;

    IntValue[] configValues() default {};

    Timer[] timers() default {};

    Configuration[] configurations() default {};
}