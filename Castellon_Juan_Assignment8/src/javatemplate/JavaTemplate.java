/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatemplate;
import java.util.Scanner;
import Geometry.Line;
import Geometry.Square;

/**
 *
 * @author Juan
 */
public class JavaTemplate {
    public static void main(String[] args) {
        //Creating Scanner
        Scanner input = new Scanner(System.in);
        
        //Creating Variables
        float length;
        float width;
        
        //Initializing Variables
        System.out.println("Please input the length of the line   : ");
        length=input.nextFloat();
        Line line=new Line(length);
        
        System.out.println("Please input the length of the square : ");
        length=input.nextFloat();
        System.out.println("Please input the width of the square  : ");
        width=input.nextFloat();
        Square square=new Square(length,width);
        
        //Process Calculations
        System.out.printf("Length of line : %f%n",line.getLen());
        System.out.printf("Area of square : %f%n",square.area());
        
    }
    
}
