package br.com.karineg;

import java.lang.annotation.*;

@Documented 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited

public @interface Tabela {
	String[] value();

}
