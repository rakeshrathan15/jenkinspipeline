package com.neoteric.loginexception;

public class UserService extends AbstractLoginInterface {




        public LoginStatus login(String username, String password) throws AuthenticationFailedException {
        try {
            // Validate credentials format
            validateCredentials(username, password);

            // Authenticate user
            if (authenticate(username, password)) {
                System.out.println("Login successful!");
                return LoginStatus.SUCCESS;
            } else {
                return LoginStatus.FAILURE;
            }
        } catch (InvalidCredentialFormatException e) {
            // Handle format validation failure
            System.err.println("Login failed: " + e.getMessage());
            return LoginStatus.INVALID_FORMAT;
        }
    }


    protected boolean authenticate(String username, String password) throws AuthenticationFailedException {
        // Example: Check against hardcoded username/password (for simplicity)
        if ("user123".equals(username) && "password123".equals(password)) {
            return true;
        } else {
            // Throw a checked exception for incorrect credentials
            throw new AuthenticationFailedException("Incorrect username or password.");
        }
    }

    public static void main(String[] args) {
        UserService loginService = new UserService();

        try {
            // Test case with valid credentials
            LoginStatus status1 = loginService.login("user123", "password123");
            System.out.println("Login status: " + status1);

            // Test case with invalid username format
            LoginStatus status2 = loginService.login("invalid username", "password123");
            System.out.println("Login status: " + status2);

            // Test case with valid format but incorrect credentials
            LoginStatus status3 = loginService.login("user123", "wrongpassword");
            System.out.println("Login status: " + status3);

        } catch (AuthenticationFailedException e) {
            // This handles the checked exception for authentication failure
            System.err.println("Authentication error: " + e.getMessage());
        }
    }


    @Override
    public boolean validate(String username, String password) throws AuthenticationFailedException {
        return false;
    }
}
