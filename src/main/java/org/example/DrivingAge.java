package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class DrivingAge
{
    public static void main( String[] args )
    {
        final int drivingAge = 16;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is your age? ");
        int age = input.nextInt();  // Read user input
        final String output = age > drivingAge
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(output);
        input.close();
    }
}
