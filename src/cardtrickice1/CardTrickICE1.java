/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrickice1;

import java.util.Scanner;

/**
 *
 * @author ranve
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.randomValue());//use a method to generate random *13
            c1.setSuits((Card.SUITS[c1.randomSuits()]));//random method suit 
            magicHand[i]= c1;    
            System.out.println(magicHand[i].getSuits()+ magicHand[i].getValue());
        }
        //step 2:take input 
        
       
        
        System.out.println("Pick up any card ");
        System.out.println("Please choose the card value");
        int UserValue = input.nextInt();
       
        System.out.println("Please choose the card suit");
         System.out.println("1.hearts , 2.diamonds, 3.spades, 4.clubs");
         String UserSuits = input.next();
        
         
         
         
         
         
         
        //step 3: match with array 
        boolean result = false;
    for( int i=0;i<magicHand.length;i++){
        if(UserValue == magicHand[i].getValue() && UserSuits == magicHand[i].getSuits()){
            result = true;
            break;
            }
       }
    if(result == true)
        System.out.println("The card is in the magic hand ");
    else
        System.out.println("Not match");
    
    }

    
}
