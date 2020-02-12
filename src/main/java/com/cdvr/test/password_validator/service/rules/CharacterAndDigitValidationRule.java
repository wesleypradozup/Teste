package com.cdvr.test.password_validator.service.rules;

import com.cdvr.test.password_validator.utils.RegexUtils;

public class CharacterAndDigitValidationRule extends BaseValidationRule {

  @Override
  public boolean validate(String password) {
    return RegexUtils.checkRegex(password, "[a-z]+") &&
           RegexUtils.checkRegex(password, "[0-9]+") &&
           RegexUtils.checkRegex(password, "^[a-z0-9]+$");
  }

  @Override
  public String getErrorMessage() {
    return
      "Password must consists of a mixture of lowercase letters and numerical digits only, with at least one of each.";
  }
}
