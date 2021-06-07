package com.bremick.javase.exercise;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter username: ");
        String username=s.next();
        System.out.print("Please enter password: ");
        String password=s.next();

        UserService userservice= new UserService();

        try {
            userservice.register(username,password);
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
    }
}

class UserService{
    String username;
    String password;
    public UserService(){

    }
    public void register(String username, String password) throws RegistrationException {
        if(username.length()<6||username.length()>14){
            RegistrationException e = new RegistrationException("username has to be between 6 to 14 digit!");
            throw e;
        }
        System.out.println("Registration successfully!");

    }
}

class RegistrationException extends Exception{
    public RegistrationException(){};
    public RegistrationException(String s){
        super(s);
    }
}
