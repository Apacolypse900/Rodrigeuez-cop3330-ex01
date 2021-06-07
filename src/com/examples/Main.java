package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("What is your name? ");

        String Name = myObj.nextLine();
        System.out.print("Hello, " + Name);
        System.out.print(", nice to meet you!");
    }
}
