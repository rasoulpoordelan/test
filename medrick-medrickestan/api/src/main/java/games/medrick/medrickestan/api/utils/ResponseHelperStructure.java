package games.medrick.medrickestan.api.utils;


public class ResponseHelperStructure {

    private String msg;
    private Object data;

    public ResponseHelperStructure() {
    }

    public ResponseHelperStructure(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public ResponseHelperStructure(Object data) {
        this.msg = "ok";
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
