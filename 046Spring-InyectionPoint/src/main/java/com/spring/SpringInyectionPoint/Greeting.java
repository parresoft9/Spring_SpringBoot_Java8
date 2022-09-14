package com.spring.SpringInyectionPoint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Greeting {

  Language language() default Language.EN;

  enum Language {
    EN, DA, ES
  }
}
