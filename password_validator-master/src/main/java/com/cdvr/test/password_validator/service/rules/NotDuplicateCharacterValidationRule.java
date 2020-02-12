package com.cdvr.test.password_validator.service.rules;

public class NotDuplicateCharacterValidationRule extends BaseValidationRule {

  @Override
  public boolean validate(String password) {

    for(int i = 0; i < password.length() - 1; i++) {
      if (password.charAt(i) == password.charAt(i+1)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public String getErrorMessage() {
    return
      "Password must not contain any sequence of characters immediately followed by the same sequence.";
  }
}
