package trilha.back.financys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IdNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IdNotFound(String exception){
        super(exception);
    }
}
