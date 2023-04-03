package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUser {
    UserValidate userValidate;
    @Before
    public void initialize(){
        userValidate = new UserValidate();
    }
    @Test
    public void firstNameHappyTest(){
        boolean firstName = userValidate.checkFirstName("Prathamesh");
        Assert.assertEquals(true,firstName);
    }
    @Test
    public void firstNameSadTest(){
        boolean firstName = userValidate.checkFirstName("prathamesh");
        Assert.assertFalse(firstName);
    }
    @Test
    public void lastNameHappyTest(){
        boolean lastName = userValidate.checkLastName("Adam");
        Assert.assertTrue(lastName);
    }
    @Test
    public void lastNameSadTest(){
        boolean lastName = userValidate.checkLastName("abcd");
        Assert.assertFalse(lastName);
    }
    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = userValidate.checkMobileNumber("+91 8983930906");
        Assert.assertTrue(phoneNumber);
    }
    @Test
    public void phoneNumberSadTest(){
        boolean phoneNumber = userValidate.checkMobileNumber("122737373838884");
        Assert.assertFalse(phoneNumber);
    }
    @Test
    public void passwordHappyTest(){
        boolean password = userValidate.checkPassword("Prath@mesh6789");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest(){
        boolean password = userValidate.checkPassword("123456");
        Assert.assertFalse(password);
    }
    @Test
    public void emailHappyTest(){
        boolean email = userValidate.checkEmail("prathamesh.10@gmail.com");
        Assert.assertTrue(email);
    }
    @Test
    public void emailSadTest(){
        boolean email = userValidate.checkEmail("prathamesh.@gmail.com");
        Assert.assertFalse(email);
    }
}
