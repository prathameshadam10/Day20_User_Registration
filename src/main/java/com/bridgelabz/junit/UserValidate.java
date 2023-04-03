package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
    static Pattern firstName = Pattern.compile("^[A-Z][a-z]{2,}");
    static Pattern lastName = Pattern.compile("^[A-Z][a-z]{2,}");
    static Pattern emailPattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
    static Pattern mobileNumber = Pattern.compile("^(\\+?\\d{1,3})\\s\\d{10}$");
    static Pattern passwordRule1 = Pattern.compile("^[A-za-z]{8,}$");
    static Pattern passwordRule2 = Pattern.compile("^(?=.*[a-z]*[A-Z]).{8,}$");
    static Pattern passwordRule3 = Pattern.compile("^(?=.*[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
    static Pattern passwordRule4 = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");

    public boolean checkFirstName(String name){
        Matcher matcher = firstName.matcher(name);
        if (matcher.matches()){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkLastName(String endName){
        Matcher matcher = lastName.matcher(endName);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkMobileNumber(String Number){
        Matcher matcher = mobileNumber.matcher(Number);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkPassword(String password){
        Matcher matcher = passwordRule4.matcher(password);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkEmail(String email){
        Matcher matcher = emailPattern.matcher(email);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
}
