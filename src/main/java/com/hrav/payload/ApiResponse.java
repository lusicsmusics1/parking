package com.hrav.payload;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Morteza Vesal
 */
@Getter
@Setter
public class ApiResponse<T> {

    private Boolean success;
    private String message;
    private int errornumber;
    private T data;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ApiResponse(Boolean success, String message, int errornumber) {
        this.success = success;
        this.message = message;
        this.errornumber = errornumber;
    }

    public ApiResponse(Boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
