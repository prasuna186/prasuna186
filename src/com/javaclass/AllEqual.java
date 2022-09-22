package com.javaclass;

public class AllEqual {

    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a==b && a==c)
        {
            System.out.println("All are equal");

        }
        else {
            System.out.println("All are not equal");
        }

    }
}
