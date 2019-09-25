package com.stackroute.pe4;

import java.util.Scanner;

public class ReplaceChars {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();
        String newStr = str;

        newStr = newStr.replaceAll("d","f");
        newStr = newStr.replaceAll("l","t");

        System.out.println(newStr);
    }
}
