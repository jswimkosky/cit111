/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * client class to car
 * contain main method
 * @author joshua.swimkosky
 */
public class CarLand {
    public static void main(String[] args){
        // create variable of car
        Car firstCar;
        // use new to instantiate our car class
        // store a reference in firstCar
        firstCar = new Car();
        // assigning values to member variables on one instance of car
        firstCar.make = "Honda";
        firstCar.model = "Accord";
        firstCar.year = 2000;
        System.out.println("firstCar engine status: " + firstCar.checkEngineStatus());
        firstCar.startEngine();
        // reading from member variables
        System.out.println("firstCar engine status: " + firstCar.checkEngineStatus());
        System.out.println("First Car model: " + firstCar.model);
        firstCar.accelerate(15);
        System.out.println("Speed: " + firstCar.accelerate(20));
        
        firstCar.deccelerate(50);
        System.out.println("Speed: " + firstCar.deccelerate(0));
        
        Car toyCar = new Car();
        toyCar.make = "Ford";
        toyCar.model = "Mustang GT";
        toyCar.year = 2016;
        toyCar.startEngine();
        
        System.out.println("Toy car is: " + toyCar.year + " " + toyCar.make + " " + toyCar.model);
        
        
        
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.make = "DMC";
        deLorean.model = "DeLorean";
        
        
        
        
    } // close main
            
    
    
    
    
    
} // close class
