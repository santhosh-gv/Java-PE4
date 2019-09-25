package com.stackroute.pe4;

import java.util.Scanner;

public class TransposeString {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String str  = obj.nextLine();
        String[] strArr = str.split(" ");
        for(int i=0;i<strArr.length;i++)
        {
            for (int j = strArr[i].length()-1;j>=0;j--)
            {
                System.out.print(strArr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
