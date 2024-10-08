package com.neuedu.ai.service.v4.fine_turning;


public class QueryFineTuningJobApiResponse {
    private int code;
    private String msg;
    private boolean success;

    private FineTuningJob data;

    public QueryFineTuningJobApiResponse() {
    }

    public QueryFineTuningJobApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        if (this.code == 200) {
            setSuccess(true);
        } else {
            setSuccess(false);
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public FineTuningJob getData() {
        return data;
    }

    public void setData(FineTuningJob data) {
        this.data = data;
    }
}
