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

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Scanner
        Scanner input = new Scanner(System.in);
        
        //Creating Variables
        String month;
        int year;
        float prodSales,countyTax,stateTax,totTax,total;
        
        //Initializing Variables
        System.out.printf("%s", "Please input the month           : ");
        month=input.next();
        System.out.printf("%s", "Please input the year            : ");
        year=input.nextInt();
        System.out.printf("%s", "Please input the total collected : ");
        prodSales=input.nextFloat();
        
        //Process Calculations
        countyTax=prodSales*.0145f;
        stateTax=prodSales*0.775f;
        totTax=prodSales/1.0920f;
        total=prodSales+totTax;
        
        //Output Results
        System.out.printf("%s%n", "-----------------");
        System.out.printf("%s%s%n", "Month : ",month);
        System.out.printf("%s%d%n", "Year  : ",year);
        System.out.printf("%s%n", "-----------------");
        System.out.printf("Total Collected  : $%.2f%n",total);
        System.out.printf("Sales            : $%.2f%n", prodSales);
        System.out.printf("County Sales Tax : $%.2f%n", countyTax);
        System.out.printf("State Sales Tax  : $%.2f%n", stateTax);
        System.out.printf("Total Sales Tax  : $%.2f%n", totTax);
        
        
    }
    
}
