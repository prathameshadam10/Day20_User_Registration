package com.bridgelabz.junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSampleEmails {
    private String gmailId;

    private boolean expectedResult;

    private SampleEmailsToCheck sampleEmailsToCheck;

    public TestSampleEmails(String gmailId, boolean expectedResult) {
        this.gmailId = gmailId;
        this.expectedResult = expectedResult;
    }

    //  "abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com","abc@yahoo.com
    @Before
    public void init(){
        sampleEmailsToCheck=new SampleEmailsToCheck();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc",false},{"3214assaffr",false},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},{"abc@yahoo.com",true}});
    }

    @Test
    public void testEmail(){
        boolean actualValue = sampleEmailsToCheck.testGmail(gmailId);
        Assert.assertEquals(expectedResult,actualValue);
    }
}
