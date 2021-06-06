/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String currentAgeString = in.nextLine();
        System.out.print("What age would you like to retire? ");
        String retirementAgeString = in.nextLine();

        int currentAge = Integer.parseInt(currentAgeString);
        int retirementAge = Integer.parseInt(retirementAgeString);
        int yearsLeft = retirementAge - currentAge;
        System.out.printf("You have %d years left until you can retire.\n", yearsLeft);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear = currentYear + yearsLeft;
        System.out.printf("It's %d, so you can retire in %d.", currentYear, retirementYear);
    }
}
