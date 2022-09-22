package com.firstassignment;

import java.util.Scanner;

public class AlphaDigitChar {
    public static void main(String[] args) {
    //Creating an object in scanner class
    Scanner s=new Scanner(System.in);
    char c=s.next().charAt(0);
    //finding variable is Alphabet or digit or special character
		if((c>='a'&&c<='z') || (c>='A'&&c<='Z'))
        {

        System.out.println("Alphabet");
    }
        else if(c>='0'&&c<='9')
        {

        System.out.println("Digit");
    }
		else
            System.out.println("Special Symbol");
}
}


