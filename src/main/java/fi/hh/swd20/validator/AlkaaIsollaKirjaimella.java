package fi.hh.swd20.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

	@Documented
	@Constraint(validatedBy = AlkaaIsollaKirjaimellaValidator.class)
	@Target( { FIELD, PARAMETER })
	@Retention(RetentionPolicy.RUNTIME)

	public @interface AlkaaIsollaKirjaimella {
		
		 String message() default "{fi.hh.swd20.AlkaaIsollaKirjaimella.message}";
		 
		 Class<?>[] groups() default {};
		 
		 Class<? extends Payload>[] payload() default {};

	}


