package cn.tedu.shoppingmallv1.web;

public enum State {
    OK(200),
    ERR_USERNAME(404),
    ERR_PASSWORD(500);

    private Integer value;

    State(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
