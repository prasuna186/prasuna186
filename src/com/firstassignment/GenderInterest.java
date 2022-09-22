package com.firstassignment;

public class GenderInterest {

    public static void main(String[] args)
    {
        String Gender = args[1];
        int age = Integer.parseInt(args[1]);
        if(args.length==0)
        {
            System.out.println("Empty Arguments");
        }
        else{
            if(Gender.equals("Male") || Gender.equals("Female"))
            {
                if(age>1 && age<=100)
                {
                       // If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%
                    if (Gender.equals("Female") && (age >= 1 && age <= 58)) {
                        System.out.println("Interest == 8.2%");
                        // If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
                    } else if (Gender.equals("Female") && (age >= 59 && age <= 100)) {
                        System.out.println("Interest == 9.2%");
                        // If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
                    } else if (Gender.equals("Male") && (age >= 1 && age <= 58)) {
                        System.out.println("Interest == 8.4%");
                        // If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 10.5%.
                    } else if (Gender.equals("Male") && (age >= 59 && age <= 100)) {
                        System.out.println("Interest == 10.5%");
                    }
                }
            }
        }
    }
}
