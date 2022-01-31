package trilha.back.financys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ParameterNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ParameterNotFound(String exception){
        super(exception);
    }
}