package trilha.back.financys.framework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import trilha.back.financys.framework.DivideByZeroException;
import trilha.back.financys.domain.ExceptionResponse;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DivideByZeroException.class)
    public final ResponseEntity<ExceptionResponse> handlerDivideByZeroException(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse =
                new ExceptionResponse (
                        new Date(),
                        ex.getMessage(),
                        request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
