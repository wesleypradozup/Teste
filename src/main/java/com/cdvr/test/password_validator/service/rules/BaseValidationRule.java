package com.cdvr.test.password_validator.service.rules;

public abstract class BaseValidationRule {

  public abstract String getErrorMessage();
  public abstract boolean validate(String password);

}
