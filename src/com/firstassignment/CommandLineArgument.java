package com.firstassignment;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("No Values");
        else {
            for (String i : args) {
                System.out.println(i + ",");
            }
        }

    }
}

