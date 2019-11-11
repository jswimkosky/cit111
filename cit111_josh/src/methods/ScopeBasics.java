/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author joshua.swimkosky
 */
public class ScopeBasics {
    // class scoped variable
    private static String classScopedVar = "All methods can see me";
    
    public static void main(String[] potato){
        // print out contents of classScopedVar     
        System.out.println(classScopedVar);
        // call demonstrateScope
        demonstrateScope();
        // print new contents of classScopedVar
        System.out.println(classScopedVar);
 
        
    } // close main
    
    public static void demonstrateScope(){
        // print out contents of classScopedVar
        System.out.println(classScopedVar);
        // overwrite classScopedVar to say: "Scope shall set you free"
        classScopedVar = "Scope shall set you free";
    }
} // close class
