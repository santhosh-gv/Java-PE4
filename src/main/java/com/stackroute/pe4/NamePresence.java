package com.stackroute.pe4;

import java.util.Scanner;

public class NamePresence {
    public static void main(String[] args) {
        String name = "Harry";

        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();

        if(str.contains(name))
        {
            System.out.println("Is Harry here? "+true);
        }
        else
        {
            System.out.println("Is Harry here? "+false);
        }
    }
}
