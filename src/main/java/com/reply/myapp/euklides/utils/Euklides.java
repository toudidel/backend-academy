package com.reply.myapp.euklides.utils;

public class Euklides {

  public static Integer nwd(Integer a, Integer b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }
}
