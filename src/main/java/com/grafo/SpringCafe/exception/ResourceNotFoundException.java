package com.grafo.SpringCafe.exception;

import com.grafo.SpringCafe.constant.ErrorCodes;
import com.grafo.SpringCafe.constant.ErrorMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends CustomRuntimeException {
    public ResourceNotFoundException(Throwable e, ErrorMsg errorMsg, String... params) {
        super(e, ErrorCodes.NOT_FOUND.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public ResourceNotFoundException(ErrorMsg errorMsg, String... params) {
        super(ErrorCodes.NOT_FOUND.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));

    }
    public ResourceNotFoundException(String errorCodes, String id, String shortMessage, String message) {
        super(errorCodes, id, shortMessage, message);
    }
}
