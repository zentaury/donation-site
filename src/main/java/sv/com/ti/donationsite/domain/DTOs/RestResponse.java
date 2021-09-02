package sv.com.ti.donationsite.domain.DTOs;

public class RestResponse<T>{
    boolean success;
    String  message;
    T data;

    public RestResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
