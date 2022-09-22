package com.firstassignment;

import java.util.Scanner;

public class FloydFormat {
    public static void main(String args[]){
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();
        System.out.println("The Floyd's format in star pattern : ");
        for(i=0; i<n; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
