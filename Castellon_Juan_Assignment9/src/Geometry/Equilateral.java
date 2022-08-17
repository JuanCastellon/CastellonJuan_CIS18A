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
public class Equilateral extends Proportions{
    //No member Variables, inheiriting everything from Proportions
    
    //Constructor
    public Equilateral(){
        super();
        this.name="Equilateral Triangle";
    }
    
    //Custom Length, Perimeter, and Area methods
    @Override
    public void setLen(double x){
        this.length=x;
    }
    @Override
    public void setPer(){
        this.perimeter=3*length;
    }
    @Override
    public void setAre(){
        this.area=Math.sqrt(3)*length*length/4;
    }
    @Override
    public void prompt(){
        System.out.printf("Please input the length of the sides of the "
                + "equilateral triangle : %n");
    }
    @Override
    public void toStri(){
        System.out.printf("The length of the sides are = %f%n"
                        + "Perimeter of Triangle = %f%n"
                        + "Area of Triangle      = %f%n",this.getLen()
                ,this.getPer(),this.getAre());
    }
}
