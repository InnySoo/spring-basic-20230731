package com.sooin.basic.service;

public interface MainService {
  String hello();
  String getRepository();
  String getPasswordEncoding(String password);
  boolean isPasswordMatch(String password, String encodedPassword);
}
