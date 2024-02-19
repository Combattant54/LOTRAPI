package fr.combattant54.lotrapi.annotations;

import fr.combattant54.lotrapi.enums.Aura;
import fr.combattant54.lotrapi.enums.Category;
import fr.combattant54.lotrapi.enums.RoleAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Role {

    String key();

    String[] loreKey() default {};

    Category category();

    RoleAttribute attribute();

    float weight() default 1;

    boolean requireDouble() default false;

    String[] requireRoles() default {};

    String[] incompatibleRoles() default {};

    IntValue[] configValues() default {};

    Configuration[] configurations() default {};

    Timer[] timers() default {};

    String auraDescriptionSpecialUseCase() default "";

    Aura defaultAura() default Aura.LIGHT;
}