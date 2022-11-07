package com.nttdata.bootcamp.yankiservice.exception.account;

import com.nttdata.bootcamp.yankiservice.exception.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class AccountExceptionHandler {

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleAccountNotFoundException(AccountNotFoundException ex) {
        return ExceptionResponse.builder().message(ex.getMessage()).build();
    }

    @ExceptionHandler(AccountCreationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionResponse handleAccountCreationException(AccountCreationException ex) {
        return ExceptionResponse.builder().message(ex.getMessage()).build();
    }

}
