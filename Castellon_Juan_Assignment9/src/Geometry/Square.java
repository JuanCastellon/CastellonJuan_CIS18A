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
public class Square extends Proportions {
    //No member Variables, inheiriting everything from Proportions
    
    //Constructor
    public Square(){
        super();
        this.name="Square";
    }
    
    //Custom Length, Perimeter, and Area methods
    @Override
    public void setLen(double x){
        this.length=x;
    }
    @Override
    public void setPer(){
        this.perimeter=4*length;
    }
    @Override
    public void setAre(){
        this.area=length*length;
    }
    @Override
    public void prompt(){
        System.out.printf("Please input the length of the square : %n");
    }
    @Override
    public void toStri(){
        System.out.printf("The length of the sides are = %f%n"
                        + "Perimeter of Square         = %f%n"
                        + "Area of Square              = %f%n",this.getLen()
                ,this.getPer(),this.getAre());
    }
}
