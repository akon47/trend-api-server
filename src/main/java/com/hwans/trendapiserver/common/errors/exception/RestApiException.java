package com.hwans.trendapiserver.common.errors.exception;


import com.hwans.trendapiserver.common.errors.errorcode.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RestApiException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String message;

    public RestApiException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = errorCode.getDefaultMessage();
    }
}
