/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner;

/**
 *
 * @author rcc
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Declare Variables
        int n1,n2,n3,n4;
        int sIndex,bIndex;//Indexes for the smallest and biggest numbers
        
        //Initialize Variables
        sIndex=bIndex=0;
        
        System.out.printf("%s%n","Please input 4 integers.");
        
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        n4=input.nextInt();
        
        //Process Calculations
        
        bIndex=sIndex=n1;
        
        //If statements to catch if sIndex is ever lower than a given number
        if(sIndex>n2){
            sIndex=n2;
        }
        if(sIndex>n3){
            sIndex=n3;
        }
        if(sIndex>n4){
            sIndex=n4;
        }
        
        //If statements to catch if bIndex is ever bigger than a given number
        if(bIndex<n2){
            bIndex=n2;
        }
        if(bIndex<n3){
            bIndex=n3;
        }
        if(bIndex<n4){
            bIndex=n4;
        }
        
                
        
        
        
        //Output Results
        
        System.out.printf("%s", "Values entered  : ");
        System.out.printf("%d%s", n1,", ");
        System.out.printf("%d%s", n2,", ");
        System.out.printf("%d%s", n3,", ");
        System.out.printf("%d%s%n", n4,".");
        
        System.out.printf("%s%d%n", "Largest Number  : ", bIndex);
        System.out.printf("%s%d%n", "Smallest Number : ", sIndex);
        
        
    }
    
}
