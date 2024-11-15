package com.neoteric.loginexception;

public abstract class AbstractLoginInterface implements LoginInterface {





    public void validateCredentials(String username, String password)  {
        if (username == null || username.isEmpty() || !username.matches("[a-zA-Z0-9_]+")) {
            throw new InvalidCredentialFormatException("Invalid username format.");
        }
        if (password == null || password.length() < 8) {
            throw new InvalidCredentialFormatException("Password must be at least 8 characters long.");
        }
    }

    // Abstract method to be implemented by subclasses for actual authentication logic
    public abstract boolean validate(String username, String password) throws AuthenticationFailedException;
}
