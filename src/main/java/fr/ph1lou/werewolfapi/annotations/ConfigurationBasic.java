package fr.ph1lou.werewolfapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConfigurationBasic {
    String key();
    String[] loreKey() default {};
    boolean defaultValue() default false;
    boolean meetUpValue() default false;
    boolean appearInMenu() default true;
    boolean appearInConfigurationList() default true;
    String[] incompatibleConfigs() default {};
}
