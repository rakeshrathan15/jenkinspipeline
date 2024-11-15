package com.neoteric.loginexception;

public interface LoginInterface {


  LoginStatus login(String username, String password) throws AuthenticationFailedException;
}




