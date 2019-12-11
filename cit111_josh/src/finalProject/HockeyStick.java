/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

/**
 *
 * @author joshua.swimkosky
 */
// creating object
public class HockeyStick {
    public String brand;
    public int flex;
    public String curve;
    public int height;
    public int durabilityPer = 100;
    private boolean useStick;
    
    // shooting puck action method
    public void shootPuck(){
        useStick = true;
        durabilityPer = durabilityPer - 5;
        System.out.println("Shot on goal. Stick durability: "
                + this.durabilityPer);
        if(this.durabilityPer < 1){
            this.durabilityPer = 0;
            System.out.println("Stick broken! End of program");
            System.exit(0);
    } // close if
    } // close shoot
    // lifting stick method action
    public void stickLift(){
        useStick = true;
        durabilityPer = durabilityPer - 2;
        System.out.println("Stick lifted. Stick durability: "
                + this.durabilityPer);
        if(this.durabilityPer < 1){
            this.durabilityPer = 0;
            System.out.println("Stick broken! End of program");
            System.exit(0);
    } // close if
    } // close stick lift
    // cross check method action
    public void crossCheck(){
        useStick = true;
        durabilityPer = durabilityPer - 10;
        System.out.println("Two minutes for cross checking. Stick durability: "
        + this.durabilityPer);
        if(this.durabilityPer < 1){
            this.durabilityPer = 0;
            System.out.println("Stick broken! End of program");
            System.exit(0);
    } // close if
    } // close cross check
    // show stats to user
    public void displayStickStats(){
        System.out.println("Stick brand: " + this.brand);
        System.out.println("Stick flex: " + this.flex);
        System.out.println("Stick curve: " + this.curve);
        System.out.println("Stick height: " + this.height + " inches");
        System.out.println("Stick durability: " + this.durabilityPer + " percent");
    } // close stick stats
    
    
    
    
    
} // close class
