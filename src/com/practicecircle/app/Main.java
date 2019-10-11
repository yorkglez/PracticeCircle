package com.practicecircle.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Declarations
        double Radio = 0;
        double Area = 0;

        //Implementation scanner
        Scanner in = new Scanner(System.in);

        //Input from user
        System.out.print("Write Radio: ");
        Radio = in.nextDouble();

        //Process
        Area = 3.1416 * (Radio * Radio);

        //Output area
        System.out.println("The area is: "+Area);
    }
}
