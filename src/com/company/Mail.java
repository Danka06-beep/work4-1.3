package com.company;

public class Mail {

    private String email;
    private String message;

    public Mail(String email,String message) {
        this.email = email;
        this.message = email;

    }

    @Override
    public String toString() {
        return String.format("mail to: %s\n%s", email, message);
    }
}
