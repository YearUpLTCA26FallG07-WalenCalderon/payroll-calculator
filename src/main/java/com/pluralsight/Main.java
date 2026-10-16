package com.pluralsight;
import java.util.Scanner;
  /*
        * Step 1
Create a Java application named payroll-calculator that prompts the user to enter:
− their name
− their hours worked (a floating point number)
− their pay rate (a floating point number)
Calculate their gross pay.
Display the employee's name and their gross pay.
Step 2
1. Ensure all your changes are committed and pushed to GitHub
2. Send your repository URL to your Instructor
        *  */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        //What we have
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your worked hours: ");
        float workHours = sc.nextFloat();

        System.out.println("Please enter your pay rate: ");
        float payRate = sc.nextFloat();


      //What we need to figure out
        //Gross Pay=(Regular Hours×Hourly Rate)+(Overtime Hours×Overtime Rate)+Bonuses/Commissions
        double grossPay =  payRate * workHours;



        //bonus
        if (workHours > 40){
          float overtimeHours = workHours - 40;
          float regularPay = 40 * payRate;
          double overtimePay = overtimeHours * payRate * 1.5;
          grossPay = regularPay + overtimePay;

        } else {
          grossPay = workHours * payRate;
        }

      // Output
      System.out.printf("%s, your gross pay is: $%.2f%n",
              name, grossPay);
    }
}