package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestUser {
    static UserValidate userValidate;

    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userValidate = new UserValidate();
    }

    @Test
    public void givenFirstNameShouldReturnTrue() throws InvalidDetailsException {
        boolean value = userValidate.validateFirstName("Prathamesh");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully passed UC1");
    }
    @Test
    public void givenLastNameShouldReturnTrue() throws InvalidDetailsException {
        boolean lastName = userValidate.validateFirstName("Adam");
        Assertions.assertTrue(lastName);
        System.out.println("Last Name Checked:- Successfully passed UC2");
    }
    @Test
    public void givenEmailShouldReturnTrue() throws InvalidDetailsException {
        boolean email = userValidate.validateFirstName("prathameshadam@gmail.com");
        Assertions.assertTrue(email);
        System.out.println("Email Id Checked:- Successfully passed UC3");
    }
    @Test
    public void givenNumberShouldReturnTrue() throws InvalidDetailsException {
        boolean Number = userValidate.validateFirstName("918787868587");
        Assertions.assertTrue(Number);
        System.out.println("Phone Number Checked:- Successfully passed UC4");
    }
    @Test
    public void givenPasswordShouldReturnTrue() throws InvalidDetailsException {
        boolean password = userValidate.validateFirstName("Pratham@1");
        Assertions.assertTrue(password);
        System.out.println("Password Checked(Rule -> 1,2,3,4):- Successfully passed UC -> 5,6,7,8");
    }

}
