package com.zuipin.interview.chenzhongqiang.base;


public class ResponseData {

    private Boolean status = true;
    private int error_code = 200;
    private String error_message = "";
    private Object data;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getError_code() {
		return error_code;
	}

	public void setError_code(int error_code) {
		this.error_code = error_code;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
