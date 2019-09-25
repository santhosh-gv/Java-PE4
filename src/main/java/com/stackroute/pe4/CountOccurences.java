package com.stackroute.pe4;


import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();

        System.out.println("Enter the character to find out the number of occurrences");
        String ch = obj.next();

        int charcount = str.length() - str.replaceAll(ch, "").length();
        System.out.println("Occurrence of '"+ch+"' in the given string is " + charcount);

    }
}
