package fr.combattant54.lotrapi.annotations;

import fr.combattant54.lotrapi.enums.UniversalMaterial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleWerewolf {
    String key();

    String[] loreKeys();

    UniversalMaterial item();

    String defaultLanguage();

    Author[] authors();

    IntValue[] configValues() default {};
}