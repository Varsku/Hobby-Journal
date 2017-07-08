package fi.hh.swd20.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AlkaaIsollaKirjaimellaValidator implements
ConstraintValidator<AlkaaIsollaKirjaimella, String> {
	
	public void initialize(AlkaaIsollaKirjaimella alkaaisollakirjaimella) {

	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		if (value== null || value.length() == 0) {
			return true;
		} else {
			return value.substring(0,1).matches("[A-ZÄÖÅ]");
		}
			
	}
}

