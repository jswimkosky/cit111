/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
        
/**
 *
 * @author joshua.swimkosky
 */
public class GemoetricShapes {
    public static void main(String[] args){
        // call calcVolumeOfCube here
        System.out.println("What shall the side length be?");
        Scanner sc = new Scanner(System.in);
        double sideLength = sc.nextInt();
        double returnedVolume = calcVolumeOfCube(sideLength);
        System.out.println("Volume of a cube: " + returnedVolume);
    } // close main
    public static double calcVolumeOfCube(double sideLength){
        // raise side length to 3 and return the result
        double cubeVolume = Math.pow(sideLength, 3);
        
        return cubeVolume; // placeholder return value
        
    } // close calcVolumeOfCube
} // close class
