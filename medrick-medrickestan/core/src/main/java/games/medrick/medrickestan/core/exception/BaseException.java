package games.medrick.medrickestan.core.exception;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BaseException(String errMsg) {
        this.errMsg = errMsg;
    }

    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
