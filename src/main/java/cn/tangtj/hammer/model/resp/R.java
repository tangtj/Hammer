package cn.tangtj.hammer.model.resp;

public class R {

    public final static String SUCCESS_CODE = "00000";

    public final static String SUCCESS_MSG = "Success";


    public static R Ok() {
        return new R();
    }

    public static R ok(String msg){
        return Ok().msg(msg);
    }

    public static R ok(String msg,Object data){
        return Ok().msg(msg).data(data);
    }

    public static R ok(Object data){
        return Ok().data(data);
    }

    public static R error(String code, String msg, String data) {
        R r = new R();
        return r.code(code)
                .msg(msg)
                .data(data);
    }


    public R code(String code) {
        this.code = code;
        return this;
    }

    public R msg(String msg) {
        this.msg = msg;
        return this;
    }

    public R data(Object data) {
        this.data = data;
        return this;
    }

    private String code = SUCCESS_CODE;

    private String msg = SUCCESS_MSG;

    private Object data;

    private R() {
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
