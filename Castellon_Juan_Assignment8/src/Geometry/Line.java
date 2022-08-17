/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author Juan
 */
public class Line {
    protected float length;
    
    public Line(float x){
        if(x<=0){
            System.out.println("The value cannot be less than or equal to "
                    + "0. Please input a valid value.");
            System.exit(0);
        }
        this.setLen(x);
    }
    
    //Setter Method
    public void setLen(float x){
        //Input validation
        if(x<=0){
            System.out.println("The value cannot be less than or equal to "
                    + "0. Please input a valid value.");
            System.exit(0);
        }
        this.length=x;
    }
    
    //Getter Method
    public float getLen(){
        return length;
    }
}
