package fr.combattant54.lotrapi.annotations;

import fr.combattant54.lotrapi.enums.StateGame;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AdminCommand {

    String key();

    String descriptionKey();

    StateGame[] statesGame() default {};

    int[] argNumbers() default {};

    boolean moderatorAccess() default false;

    boolean hostAccess() default true;

    boolean autoCompletion() default true;
}