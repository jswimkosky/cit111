/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;
import java.util.Scanner;

/**
 *
 * @author joshua.swimkosky
 */
public class HockeyStickProject {
    public static void main (String[] args){
        choosePlayer();
        
        
        
    } // close main
    
    // method that takes user input to send the user to their desired player
    public static void choosePlayer(){
        String player;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your player (enter last name)");
        System.out.println("Enter '1' for a list of names.");
        player = input.next();
        switch(player.toLowerCase()){
            case "crosby":
                bauerCrosby();
                break;
            case "matthews":
                bauerMatthews();
                break;
            case "mcdavid":
                ccmMcDavid();
                break;
            case "pettersson":
                bauerPettersson();
                break;
            case "mackinnon":
                ccmMackinnon();
                break;
            case "barzal":
                ccmBarzal();
                break;
            case "pastrnak":
                bauerPasta();
                break;
            case "1":
                System.out.println("crosby; "
                        + "matthews; "
                        + "mcdavid; "
                        + "pettersson; "
                        + "mackinnon; "
                        + "barzal; "
                        + "pastrnak; "
                        + "ovechkin; ");
                        choosePlayer();
                        break;
            case "ovechkin":
                ccmOvechkin();
                break;
                
                 
            
        } // close switch
        
        
    } // close chooseplayer
    
    // Sidney Crosby stick
    public static void bauerCrosby(){
        System.out.println("Sidney Crosby selected.");
        HockeyStick bauerCrosby;
        bauerCrosby = new HockeyStick();
        bauerCrosby.brand = "Bauer";
        bauerCrosby.flex = 100;
        bauerCrosby.curve = "P29";
        bauerCrosby.height = 54;
        bauerCrosby.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program?");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    bauerCrosby.shootPuck();
                    break;
                case "sticklift":
                    bauerCrosby.stickLift();
                    break;
                case "crosscheck":
                    bauerCrosby.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
        } // end switch
        } // end loop
    } // close bauerCrosby
    // Auston Matthews stick
    public static void bauerMatthews(){
        System.out.println("Auston Matthews selected.");
        HockeyStick bauerMatthews;
        bauerMatthews = new HockeyStick();
        bauerMatthews.brand = "Bauer";
        bauerMatthews.flex = 80;
        bauerMatthews.curve = "P92";
        bauerMatthews.height = 60;
        bauerMatthews.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    bauerMatthews.shootPuck();
                    break;
                case "sticklift":
                    bauerMatthews.stickLift();
                    break;
                case "crosscheck":
                    bauerMatthews.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close bauerMatthews
    // Connor Mcdavid stick
    public static void ccmMcDavid(){
        System.out.println("Connor McDavid selected");
        HockeyStick ccmMcDavid;
        ccmMcDavid = new HockeyStick();
        ccmMcDavid.brand = "CCM";
        ccmMcDavid.flex = 85;
        ccmMcDavid.curve = "P28";
        ccmMcDavid.height = 60;
        ccmMcDavid.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    ccmMcDavid.shootPuck();
                    break;
                case "sticklift":
                    ccmMcDavid.stickLift();
                    break;
                case "crosscheck":
                    ccmMcDavid.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close mcdavid
    // Elias Pettersson Stick
    public static void bauerPettersson(){
        System.out.println("Elias Pettersson selected.");
        HockeyStick bauerPettersson;
        bauerPettersson = new HockeyStick();
        bauerPettersson.brand = "Bauer";
        bauerPettersson.flex = 85;
        bauerPettersson.curve = "P92";
        bauerPettersson.height = 62;
        bauerPettersson.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    bauerPettersson.shootPuck();
                    break;
                case "sticklift":
                    bauerPettersson.stickLift();
                    break;
                case "crosscheck":
                    bauerPettersson.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close pettersson
    // Nathan Mackinnon Stick
    public static void ccmMackinnon(){
        System.out.println("Nathan MacKinnon selected.");
        HockeyStick ccmMackinnon;
        ccmMackinnon = new HockeyStick();
        ccmMackinnon.brand = "CCM";
        ccmMackinnon.flex = 80;
        ccmMackinnon.curve = "P28";
        ccmMackinnon.height = 63;
        ccmMackinnon.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    ccmMackinnon.shootPuck();
                    break;
                case "sticklift":
                    ccmMackinnon.stickLift();
                    break;
                case "crosscheck":
                    ccmMackinnon.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close mackinnon
    // Mathew barzal stick
    public static void ccmBarzal(){
        System.out.println("Mathew Barzal selected");
        HockeyStick ccmBarzal;
        ccmBarzal = new HockeyStick();
        ccmBarzal.brand = "CCM";
        ccmBarzal.flex = 80;
        ccmBarzal.curve = "P38";
        ccmBarzal.height = 61;
        ccmBarzal.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    ccmBarzal.shootPuck();
                    break;
                case "sticklift":
                    ccmBarzal.stickLift();
                    break;
                case "crosscheck":
                    ccmBarzal.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close Barzal
    // david pastrnak stick
    public static void bauerPasta(){
        System.out.println("David Pastrnak selected.");
        HockeyStick bauerPasta;
        bauerPasta = new HockeyStick();
        bauerPasta.brand = "Bauer";
        bauerPasta.flex = 77;
        bauerPasta.curve = "P92";
        bauerPasta.height = 63;
        bauerPasta.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    bauerPasta.shootPuck();
                    break;
                case "sticklift":
                    bauerPasta.stickLift();
                    break;
                case "crosscheck":
                    bauerPasta.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close pastrnak
    // alex ovechkin stick
    public static void ccmOvechkin(){
        System.out.println("Alex Ovechkin selected.");
        HockeyStick ccmOvechkin;
        ccmOvechkin = new HockeyStick();
        ccmOvechkin.brand = "CCM";
        ccmOvechkin.flex = 80;
        ccmOvechkin.curve = "Ovechkin Curve";
        ccmOvechkin.height = 66;
        ccmOvechkin.displayStickStats();
        for(;;){
            System.out.println("Would you like to shoot the puck, lift someone's "
                + "stick, cross check someone, or end the program? (No spaces)");
            System.out.println("COMMANDS: shoot; liftstick; crosscheck; end;");
            String action;
            Scanner input = new Scanner(System.in);
            action = input.next();
            switch(action.toLowerCase()){
                case "shoot":
                    ccmOvechkin.shootPuck();
                    break;
                case "sticklift":
                    ccmOvechkin.stickLift();
                    break;
                case "crosscheck":
                    ccmOvechkin.crossCheck();
                    break;
                case "end":
                    System.out.println("End of program.");
                    System.exit(0);
            } // end switch
         } // end loop
    } // close ovechkin
    
} // close class
