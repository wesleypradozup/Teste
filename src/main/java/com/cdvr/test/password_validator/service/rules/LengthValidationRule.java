package com.cdvr.test.password_validator.service.rules;

public class LengthValidationRule extends BaseValidationRule {

  @Override
  public String getErrorMessage() {
    return "Password must be between 5 and 12 characters in length.";
  }

  @Override
  public boolean validate(String password) {
    return password.length() >= 5 && password.length() <= 12;
  }
}
