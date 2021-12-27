package trilha.back.financys.Domain;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideByZeroException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DivideByZeroException(String exception){
        super(exception);
    }
}
