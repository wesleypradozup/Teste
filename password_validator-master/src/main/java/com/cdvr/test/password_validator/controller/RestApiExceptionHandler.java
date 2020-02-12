package com.cdvr.test.password_validator.controller;

import com.cdvr.test.password_validator.dto.VerifyPasswordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestApiExceptionHandler {

  @ExceptionHandler({RuntimeException.class})
  public ResponseEntity<VerifyPasswordDTO> handleRestApiException(Exception ex) {

    return ResponseEntity.ok(new VerifyPasswordDTO(false, ex.getMessage()));
  }
}
