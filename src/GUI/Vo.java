package GUI;

import net.sf.json.JSONArray;

import java.util.List;

public class Vo {
    int code;
    String msg;
    int count;
    JSONArray data;

    public Vo() {
    }

    public Vo(int code, String msg, int count,  JSONArray data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public  JSONArray getData() {
        return data;
    }

    public void setData( JSONArray data) {
        this.data = data;
    }
}