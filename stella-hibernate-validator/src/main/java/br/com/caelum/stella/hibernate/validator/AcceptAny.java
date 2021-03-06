package br.com.caelum.stella.hibernate.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.validator.ValidatorClass;

import br.com.caelum.stella.hibernate.validator.logic.StellaAcceptAnyValidator;
import br.com.caelum.stella.validation.AcceptAnyValidator.Documento;

/**
 * Restrição que pode ser associada a objetos em que o método
 * {@linkplain #toString()} represente um dos documentos passados como parametro.
 * 
 * @author Leonardo Bessa
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( { FIELD, METHOD })
@ValidatorClass(StellaAcceptAnyValidator.class)
public @interface AcceptAny {
    String message() default "{document_invalid}";

    boolean formatted() default false;
    
    Documento[] documentos();

}
