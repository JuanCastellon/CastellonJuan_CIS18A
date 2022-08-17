package javatemplate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class MonthDays {
    //Creating Scanner
    
    private int month;
    private int year;
    
    //Constructor
    MonthDays(int m,int y){
        this.setMon(m);
        this.setYer(y);        
    }
    
    //Setter Functions (input validation handled in main)
    public void setMon(int mon){
        //Input Validation
            this.month=mon;
    }
    public void setYer(int yer){
        this.year=yer;
    }
    
    //Getter Functions
    public int getMon(){
        return month;
    }
    public int getYer(){
        return year;
    }
    
    public int getNumberOfDays(int year,int month){
        boolean leap;
        int days;
        
        //Initializing Variables
        days=0;
        leap=false;
        
        //Checking for leap years
        if(year%100==0){
            if(year%400==0){
                leap=true;
            }
        }
        else{
            if(year%4==0){
                leap=true;
            }
        }
        
        if(leap){
            switch(month){
                case 1:
                    days=31;
                    break;
                case 2:
                    days=29;
                    break;
                case 3:
                    days=31;
                    break;
                case 4:
                    days=30;
                    break;
                case 5:
                    days=31;
                    break;
                case 6:
                    days=30;
                    break;
                case 7:
                    days=31;
                    break;
                case 8:
                    days=31;
                    break;
                case 9:
                    days=30;
                    break;
                case 10:
                    days=31;
                    break;
                case 11:
                    days=30;
                    break;
                case 12:
                    days=31;
                    break;
            }
        }
        else{
            switch(month){
                    case 1:
                    days=31;
                    break;
                case 2:
                    days=28;
                    break;
                case 3:
                    days=31;
                    break;
                case 4:
                    days=30;
                    break;
                case 5:
                    days=31;
                    break;
                case 6:
                    days=30;
                    break;
                case 7:
                    days=31;
                    break;
                case 8:
                    days=31;
                    break;
                case 9:
                    days=30;
                    break;
                case 10:
                    days=31;
                    break;
                case 11:
                    days=30;
                    break;
                case 12:
                    days=31;
                    break;
            }
        }
        return days;
    }
}
