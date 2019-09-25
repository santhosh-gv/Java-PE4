package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MulipleOccurrencesOfWord {

    public static void main(String[] args) {

        System.out.println("Enter the statement");
        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();
        System.out.println("Enter the word");
        String word = obj.next();

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find())
        {
            System.out.println("Found at : "+ matcher.start() + " - " + matcher.end());
        }
    }
}
