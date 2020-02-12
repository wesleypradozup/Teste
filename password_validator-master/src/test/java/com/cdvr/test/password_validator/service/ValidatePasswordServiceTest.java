package com.cdvr.test.password_validator.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidatePasswordServiceTest {

  private ValidatePasswordService validator;

  @Before
  public void setUp(){
    validator = new ValidatePasswordService();
  }

  @Test
  public void validatePasswordEmptyFail() {
    assertThat(validator.validate("234df")).isTrue();
  }

  @Test
  public void validatePasswordLength5CorrectCharacter() {
    assertThat(validator.validate("234df")).isTrue();
  }

  @Test
  public void validatePasswordLength12CorrectCharacter() {
    assertThat(validator.validate("24dtyuiop163")).isTrue();
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordLength4CorrectCharacter() {
    validator.validate("24da");
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordWithCommaFail() {
    validator.validate("24da,h");
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordOnlyDigitsFail() {
    validator.validate("247890");
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordOnlyCharactersFail() {
    validator.validate("acghukl");
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordDuplicateCharactersFail() {
    validator.validate("24dahhk");
  }

  @Test(expected = RuntimeException.class)
  public void validatePasswordUppercaseCharactersFail() {
    validator.validate("24dahAk");
  }

  @Test
  public void validatePasswordNotDuplicateCharacterCorrect() {
    assertThat(validator.validate("24dahkdk3k")).isTrue();
  }

}
