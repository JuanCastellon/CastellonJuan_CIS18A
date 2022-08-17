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
        int size;//The size of the array
        double max;//Maximum
        double min;//Minimum
        double avg;//Average
        double sdp;//Standard Deviation (population)
        double sds;//Standard Deviation (sample)
        String sMin="Minimum:";
        String sMax="Maximum:";
        String sAvg="Average:";
        String stDP="Standard Deviation (population):";
        String stDS="Standard Deviation (sample):";
        
        
        //Prompting User For Size
        System.out.println("How many number of the type double do you want to"
                + " store in your array? ");
        size=input.nextInt();
        
        //Creating the array
        double[] a = new double[size];
        
        
        //Inputting all data
        for(int i=0;i<a.length;i++){
            System.out.printf("Enter a value #%d : ",i+1);
            a[i]=input.nextDouble();
        }
        
        //Initializing max/min to the first element of the array
        max=a[0];
        min=a[0];
        
        //Average and standard deviations set to 0
        avg=0;
        
        //Finding the max
        for(int i=0;i<size;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        
        //Finding the min
        for(int i=0;i<size;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        
        //Finding the average
        for(int i=0;i<size;i++){
            avg+=a[i];
        }
        avg/=a.length;
        
        //Finding the Standard Deviations
        sdp=fndStdP(a,avg);
        sds=fndStdS(a,avg);
        
        //Output Results
        System.out.println("The statistics for your user entered array is:");
        System.out.println("----------------------------------------------");
        System.out.printf("%32s %11.3f %n",sMin,min);
        System.out.printf("%32s %11.3f %n",sMax,max);
        System.out.printf("%32s %11.3f %n",sAvg,avg);
        System.out.printf("%s %11.3f %n",stDP,sdp);
        System.out.printf("%32s %11.3f %n",stDS,sds);
    }
    
    //Method to find the standard deviation of the population
    public static double fndStdP(double[] a, double mean){
        //Declare Variables
        double stdDP,diff;//Diff is the difference between data point - the mean
        
        //Initializing Variables
        diff=0;
        
        for(int i=0;i<a.length;i++){
            diff+=Math.pow(a[i]-mean,2);
        }
        
        stdDP=diff/a.length;       
        
        return Math.sqrt(stdDP);
    }
    
    //Method to find the standard deviation of the sample
    public static double fndStdS(double[] a, double mean){
        //Declare Variables
        double stdDS,diff;//Diff is the difference between data point - the mean
        
        //Initializing Variables
        diff=0;
        
        for(int i=0;i<a.length;i++){
            diff+=Math.pow(a[i]-mean,2);
        }
        
        //Dividing it by the number of data points and then taking the square root
        stdDS=Math.sqrt(diff/(a.length-1));
        
        return stdDS;
    }
    
}
