/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagecore;
import java.util.Scanner;
/**
 *
 * @author joshua.swimkosky
 */
public class FriendshipCompatibility {
    public static void main (String[] args){
        System.out.println("What are the chances we could be friends?");
        // value for response to question 
        int response;
        // introducing compatibility score
        int compScore = 0;

        
        System.out.println("Do you like sports? 0-No 1-Yes");
        
        // create a scanner object and store a reference to it in variable
        // of type Scanner called keyboardReader
        Scanner answers = new Scanner(System.in);
        response = answers.nextInt();
        
        if(response == 1){
            System.out.println("Is your favorite sport soccer or hockey? 0-No"
                    +" 1-Yes"); 
           response = answers.nextInt();
           if (response == 0) 
               compScore = compScore + 5;
           // add 5 to compScore
           else {
               System.out.println("Is your favorite sport hockey? 1-Yes 0-No");
               response = answers.nextInt();
               if(response == 0)
                   compScore = compScore + 10;
               // add 10 to compScore
               else{
                   compScore = compScore + 20;
                   System.out.println("Great! ");
               
               } // close else if hockey is favorite sport
           } // close else if soccer is favorite sport
           
            
            
        } // close question 1
        System.out.println("Question 2: Do you like dogs? 1-Yes 0-No ");
        response = answers.nextInt();
        if(response == 0)
            compScore = compScore;
        else{
            compScore = compScore + 5;
            System.out.println("Awesome! ");
        }
        System.out.println("Do you like music? 1-Yes 0-No ");
        response = answers.nextInt();
        if(response == 0)
            compScore = compScore;
        else{
            System.out.println("Do you like country music? 1-Yes 0-No ");
            response = answers.nextInt();
            if(response == 1)
                compScore = compScore - 15;
            else{
                System.out.println("Do you like hip-hop/rap music?" + 
                        "1-Yes 0-No ");
                response = answers.nextInt();
                if(response == 0)
                    compScore = compScore;
                else{
                    compScore = compScore + 15;
                    System.out.println("Kendrick the goat though ");
                } // closes else if hip-hop favorite music
            } // closes else if hip-hop not favorite music
        } // closes else if country is favorite music
        System.out.println("Do you watch TV shows? 1-Yes 0-No ");
        response = answers.nextInt();
        if(response == 0)
            compScore = compScore;
        else{
            System.out.println("Do you prefer comedies? 1-Yes 0-No ");
            response = answers.nextInt();
            if(response == 0)
                compScore = compScore;
            else{
                compScore = compScore + 10;
                System.out.println("Cool!");
            } // closes else if likes comedies
                       
        } // closes else if does not like comedies
        System.out.println("Do you play video games? 1-Yes 0-No ");
        response = answers.nextInt();
        if(response == 0)
            compScore = compScore;
        else{
            compScore = compScore + 5;
            System.out.println("Awesome!" );
        } // closes else if plays video games
        System.out.println("Your compatibility score is:" + compScore );
        if(compScore >= 35);
        System.out.println("Congratulations! Your friendship score is high ");
        if(compScore <= 34 && compScore >= 10);             
        System.out.println("Your friendship compatibility score is medium ");
        if(compScore <= 9);
        System.out.println("Your friendship compatibility score is low "); 
    } // closes main 
} // closes class 
