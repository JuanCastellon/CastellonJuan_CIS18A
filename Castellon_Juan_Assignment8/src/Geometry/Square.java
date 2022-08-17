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
public class Square extends Line {
    protected float width;
    
    //Constructor
    public Square(float x,float y){
        super(x);
        if(y<=0){
            System.out.println("The value cannot be less than or equal to "
                    + "0. Please input a valid value.");
            System.exit(0);
        }
        this.width=y;
    }
    
    //Setter
    public void setWid(float y){
        if(y<=0){
            System.out.println("The value cannot be less than or equal to "
                    + "0. Please input a valid value.");
            System.exit(0);
        }
        this.width=y;
    }
    
    //Getter
    public float getWid(){
        return width;
    }
    
    //Area calculation
    public float area(){
        return width*length;
    }
}
