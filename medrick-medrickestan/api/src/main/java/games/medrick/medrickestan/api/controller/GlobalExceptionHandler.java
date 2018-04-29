package games.medrick.medrickestan.api.controller;

import games.medrick.medrickestan.api.utils.ResponseHelperStructure;
import games.medrick.medrickestan.core.exception.BaseException;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rasoul on 2/4/2017.
 */

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger logger = Logger.getLogger("");

    @ExceptionHandler(BaseException.class)
    public ResponseEntity handleCustomException(BaseException ex) {
        logger.error(ex.getErrMsg());
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return new ResponseEntity(new ResponseHelperStructure(ex.getErrMsg(), null), status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleAllException(Exception ex) {
        logger.error(ex.getMessage());
        return new ResponseEntity(new ResponseHelperStructure("error_in_server", null), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
