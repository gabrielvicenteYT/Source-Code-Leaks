package rip.autumn.module.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rip.autumn.module.ModuleCategory;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Category {
   ModuleCategory value();
}
