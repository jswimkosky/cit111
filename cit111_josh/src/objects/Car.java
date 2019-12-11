/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author joshua.swimkosky
 */
public class Car {
    public String make;
    public String model;
    public int year;
    public double mpg;
    public String color;
    
    private double speed;
    private boolean engineOn;
    
    /**
     * Simulates starting this instance of Car's engine.
     */
    
    
    public void startEngine(){
        engineOn = true;
        System.out.println("Engine on");
    } // close startEngine
    
    public void stopEngine(){
        engineOn = false;
        System.out.println("Engine off");
    }
    
    
    /**
     * Getter method for retrieving engine status
     * @return value of member variable engineOn
     */
    
    
    public boolean checkEngineStatus(){
        return engineOn;
        
    } // close checkEngineStatus
    // method accelerate
    // takes in int and adds to speed variable
    
    public double accelerate(int speedIncrease){
        speed = speed + speedIncrease;
        return speed;
        
        
        
    } // close accelerate
    
    
    public double deccelerate(int speedDecrease){
        speed = speed - speedDecrease;
        if(speed < 0){
            speed = 0;
            
        }
        
        
        
        
        
        return speed;
        
    } // close deccelerate
    
    
    
    
    
} // close class
