package com.cdvr.test.password_validator.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

  public static boolean checkRegex(String password, String regex) {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);

    return matcher.find();
  }
}
