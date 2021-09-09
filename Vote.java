package com.company;

import java.util.*;

public class Vote
{
    public static void main(final String[] args) {
        System.out.println("enter the age ");
        final Scanner in = new Scanner(System.in);
        final int a = in.nextInt();
        vote(a);
    }
    
    static void vote(final int a) {
        if (18 <= a) {
            System.out.println("you are eligible to give the vote");
        }
        else {
            System.out.println("you are not eligible to give the vote");
        }
    }
}