package com.stackroute.pe4;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        System.out.println("Enter the statement");
        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();

        String[] strArr = str.split(" ");



        for (int i=0;i<strArr.length-1;i++)
        {
            for (int  j=i+1;j<strArr.length;j++)
            {
                if (strArr[i].compareTo(strArr[j]) > 0)
                {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                    }
            }
        }

        for (int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }
    }
}
