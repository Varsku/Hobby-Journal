package fi.hh.swd20.dao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class HarrastustaEiLoydyPoikkeus extends RuntimeException {

	public HarrastustaEiLoydyPoikkeus(Exception cause) {
		super(cause);
	}
	
}