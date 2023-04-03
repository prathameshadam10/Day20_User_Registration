package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailsToCheck {
    Scanner input = new Scanner(System.in);

    public boolean testGmail(String testGmail) {
        Pattern pattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
        Matcher matcher = pattern.matcher(testGmail);

        if (matcher.matches())
            return true;
        else
            return false;
    }
}

