package com.cdvr.test.password_validator.service;

import com.cdvr.test.password_validator.service.rules.BaseValidationRule;
import com.cdvr.test.password_validator.service.rules.ValidationRules;
import org.springframework.stereotype.Service;

@Service
public class ValidatePasswordService {

  public boolean validate(String password) {
    for (BaseValidationRule rule : ValidationRules.rules) {
      if (!rule.validate(password)) {
        throw new RuntimeException(rule.getErrorMessage());
      }
    }

    return true;
  }
}
