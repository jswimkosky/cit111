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
public class DountLand {

    public static void main(String[] args) {
    }

    private static class glazed {

        public glazed() {
            Donut glazed = new Donut();
            glazed.perRemaining = 100;
            glazed.flavor = "Glazed";
            glazed.calories = 100;

        } // close class
    } // close glazed

    private static class choco {

        public choco() {
            Donut choco = new Donut();
            choco.perRemaining = 100;
            choco.flavor = "Chocolate";
            choco.calories = 230;
        } // end class
    } // end choco

    private static class powderBoi {

        public powderBoi() {
            Donut powderBoi = new Donut();
            powderBoi.perRemaining = 100;
            powderBoi.flavor = "Cinnamon";
            powderBoi.calories = 230;
        } // end class
    } // end powderBoi
}
