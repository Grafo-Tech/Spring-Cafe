package com.grafo.SpringCafe.exception;

import com.grafo.SpringCafe.constant.ErrorCodes;
import com.grafo.SpringCafe.constant.ErrorMsg;

public class BadRequestException extends CustomRuntimeException{
    public BadRequestException(Throwable e, ErrorMsg errorMsg, String... params) {
        super(e, ErrorCodes.BAD_REQUEST.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public BadRequestException(ErrorMsg errorMsg, String... params) {
        super(ErrorCodes.BAD_REQUEST.getCode(), errorMsg.toString(),errorMsg.getShortMessage(), String.format(errorMsg.getMessage(), params));
    }
    public BadRequestException(String errorCodes, String id, String shortMessage, String message) {
        super(errorCodes, id, shortMessage, message);
    }

}
