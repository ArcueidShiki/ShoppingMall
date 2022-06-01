package cn.tedu.shoppingmallv1.web;

public class JsonResult <T> {
    private Integer state;
    private String message;
    private T data;
    private JsonResult() {}

    public static JsonResult<Void> ok() {
        return ok(null);
    }

    public static <T> JsonResult<T> ok(T data) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setState(State.OK.getValue());
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult<Void> fail(State state, String message) {
        JsonResult<Void> jsonResult = new JsonResult<>();
        jsonResult.setState(state.getValue());
        jsonResult.setMessage(message);
        return jsonResult;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
