package com.cdvr.test.password_validator.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerifyPasswordDTO {

  private boolean valid;

  private String message;

  public VerifyPasswordDTO(boolean valid) {
    this.valid = valid;
  }

  public VerifyPasswordDTO(boolean valid, String message) {
    this.valid = valid;
    this.message = message;
  }

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
