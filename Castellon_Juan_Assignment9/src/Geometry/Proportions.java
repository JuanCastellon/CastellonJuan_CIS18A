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
public abstract class Proportions implements Calculations{
    //Member Variables
    protected String name;
    protected double length;
    protected double perimeter;
    protected double area;
    
    
    //Constructor
    public Proportions(){
        length=perimeter=area=0;
    }
    
    //Getters
    public double getLen(){
        return length;
    }
    public double getPer(){
        return perimeter;
    }
    public double getAre(){
        return area;
    }
    public String getNam(){
        return name;
    }   
}
