/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatemplate;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Juan
 */
public class JavaTemplate {
    public static void main(String[] args) {
        //Creating Scanner
        Scanner input = new Scanner(System.in);
        
        //Creating Variables
        int month=0;
        int year=0;
        boolean okay=false;
        
        //Initializing Variables
        while(!okay){
            try{
                //Prompting and inputting the month
                System.out.printf("Enter the month (1=January, 2=February, ... , "
                        + "12=December) : ");
                month=input.nextInt();
                
                //Throwing the exception
                if(month>12||month<1){
                    throw new IllegalArgumentException();
                }
                
                //Prompting for and inputting the year
                System.out.println("Enter the year : ");
                year=input.nextInt();
                
                if(year<1){
                    throw new IllegalArgumentException();
                }
                
                okay=true;
            }
            catch(IllegalArgumentException e){
                System.err.println("ERROR : Invalid month or year. Please enter a "
                + "year greater than 0 and a month between 1 and 12.");
            }
        }
        
        MonthDays days=new MonthDays(month,year);
        System.out.printf("%d/%d has %d days %n",days.getMon(),days.getYer(),
        days.getNumberOfDays(year, month));
    }
    
}
