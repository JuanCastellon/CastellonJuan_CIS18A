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
public class Circle extends Proportions {
    //No member Variables, inheiriting everything from Proportions
    
    //Constructor
    public Circle(){
        super();
        this.name="Circle";
    }
    
    //Custom Length, Perimeter, and Area methods
    @Override
    public void setLen(double x){
        this.length=x;
    }
    @Override
    public void setPer(){
        this.perimeter=Math.PI*length*2;
    }
    @Override
    public void setAre(){
        this.area=Math.PI*length*length;
    }
    @Override
    public void prompt(){
        System.out.printf("Please input the radius of the circle : %n");
    }
    @Override
    public void toStri(){
        System.out.printf("Radius              = %f%n"
                        + "Circumference       = %f%n"
                        + "Area of Circle      = %f%n",this.getLen(),this.getPer(),
                                this.getAre());
    }
}
