package games.medrick.medrickestan.api.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {
    private ResponseHelper() {
    }

    public static ResponseEntity response(Object data) {
        return new ResponseEntity(new ResponseHelperStructure(data), HttpStatus.OK);
    }

    public static ResponseEntity response(Object data, HttpStatus status) {
        return new ResponseEntity(new ResponseHelperStructure(data), status);
    }

    public static ResponseEntity response(Object data, String msg, HttpStatus status) {
        return new ResponseEntity(new ResponseHelperStructure(msg, data), status);
    }
}
