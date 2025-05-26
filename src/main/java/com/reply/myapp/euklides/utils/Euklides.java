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

  public static Integer nww(Integer a, Integer b) {
    return (a * b) / nwd(a, b);
  }
}
