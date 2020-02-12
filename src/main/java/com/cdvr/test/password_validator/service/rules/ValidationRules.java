package com.cdvr.test.password_validator.service.rules;

import java.util.ArrayList;
import java.util.List;

public class ValidationRules {

  public static List<BaseValidationRule> rules = new ArrayList<>();

  static {
    rules.add(new LengthValidationRule());
    rules.add(new CharacterAndDigitValidationRule());
    rules.add(new NotDuplicateCharacterValidationRule());
  }

}
