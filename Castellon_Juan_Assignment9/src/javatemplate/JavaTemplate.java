/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatemplate;
import java.util.Scanner;
import Geometry.Proportions;
import Geometry.Square;
import Geometry.Circle;
import Geometry.Equilateral;


/**
 *
 * @author Juan
 */
public class JavaTemplate {
    public static void main(String[] args) {
        //Creating Scanner
        Scanner input = new Scanner(System.in);
        
        //Creating Variables
        final int size;
        int value;
        double num;
        
        //Initializing Variables
        System.out.printf("Please input the size of shapes array : %n");
        size=input.nextInt();
        
        //Making the shapes array
        Proportions arr[]=new Proportions[size];
        
        //Going through a for loop and letting the user pick the contents of arr
        for(int i=0;i<size;i++){
            //Prompting the user to pick a shape
            System.out.printf("What shape would you like for element"
                    + " %d of the array?%n",i+1);
            System.out.printf("Square : 1%nCircle : 2%n"
                    + "Equilateral Triangle : 3 %n");
            value=input.nextInt();
            
            //Input Validation
            while(value<0||value>3){
                System.out.printf("Invalid input, please enter a number between"
                        + " 1 and 3 :%n");
                value=input.nextInt();
            }
            
            switch(value){
                case 1:
                    arr[i]=new Square();
                    break;
                case 2:
                    arr[i]=new Circle();
                    break;
                case 3:
                    arr[i]=new Equilateral();
                    break;
            }
        }
        
        //Data input loop
        for(int i=0;i<size;i++){
            arr[i].prompt();
            num=input.nextDouble();
            arr[i].setLen(num);
        }
        
        //Process and Output Calculations
        for(int i=0;i<size;i++){
            //Calculating the perimeter and area based off the inputted length
            arr[i].setPer();
            arr[i].setAre();
            
            //Outputting the results
            arr[i].toStri();
            System.out.println("==================");
        }
        
        //Output Results
        
        
        
    }
    
}
