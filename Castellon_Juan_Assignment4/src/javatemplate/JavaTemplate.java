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
        int number;
        String perfects;
        
        
        //Initializing Variables
        System.out.println("Enter the largest number to try to display : ");
        
        //Input Validation to make sure an invalid number is not used
        do{
            number=input.nextInt();
            if(number>=100000||number<=1){
                System.out.println("Please enter an valid number.");
            }
            
        }while(number>=100000||number<=1);
        
        
        //Process Calculations/Output Results
        perfects=isPerfect(number);
        
        System.out.print(perfects);
        
    }
    public static String isPerfect(int number){
        //Declaring Variables
        int sum=0;           //Sum for checking if a number is a perfect or not
        boolean none=false;  //Boolean to check if there was a perfect # or not
        String perfects="";  //The string to hold the answer 
        
        //Looping through all numbers until the inputted number
        for(int i=2;i<number;i++){
            //Testing to see if the first counter is a candidate to be perfect
            for(int j=1;j<number;j++){
                //Making sure the second counter is a factor and not the same #
                if(i%j==0&&j!=i){
                    sum+=j;
                }
            }
            //Final test to see if the number is truly a perfect number
            if(i==sum){
                
                //Flagging that there was a perfect number
                none=true;
                
                //Displaying the resulting perfect number
                perfects+=i;
                perfects+=" is perfect.\n";
                perfects+="Factors : ";
                
                
                //For loop for finding the factors and displaying them
                for(int j=1;j<number;j++){
                    if(i%j==0&&j!=i){
                        perfects+=j;
                        perfects+=" ";
                    }
                }
                
                perfects+="\n";
                System.out.printf("%n");
            }
            
            //Resetting the sum back to 0 for the next iteration of the for loop
            sum=0;
            
            
        }
        //Prompting the user that there was no perfect number in the interval
        if(none==false){
            perfects+="There were no perrfect numbers in the interval.";
        }
        return perfects;
    }
}
