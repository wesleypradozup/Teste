package com.cdvr.test.password_validator.controller;

import com.cdvr.test.password_validator.dto.VerifyPasswordDTO;
import com.cdvr.test.password_validator.service.ValidatePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class ValidatePasswordController {

  @Autowired
  private ValidatePasswordService validatePassword;

  @GetMapping("/validate")
  public ResponseEntity<VerifyPasswordDTO> valid(@RequestParam String password) {

    return ResponseEntity.ok(new VerifyPasswordDTO(validatePassword.validate(password)));
  }

}
