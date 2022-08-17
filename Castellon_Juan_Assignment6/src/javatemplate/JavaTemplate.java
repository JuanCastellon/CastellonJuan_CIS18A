/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatemplate;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class JavaTemplate {
    public static void main(String[] args) {
        //Creating Scanner
        Scanner input = new Scanner(System.in);
        
        //Creating Variables
        int month;
        int year;
        
        //Initializing Variables
        System.out.printf("Enter the month (1=January, 2=February, ... , "
                + "12=December) : ");
        month=input.nextInt();
        System.out.println("Enter the year : ");
        year=input.nextInt();
        
        //Process Calculations
        MonthDays days=new MonthDays(month,year);
        
        //Output Results
        System.out.printf("%d/%d has %d days %n",days.getMon(),days.getYer(),
        days.getNumberOfDays(year, month));
        
        
    }
    
}
