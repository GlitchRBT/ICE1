/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author manju manju
 * 991579746
 * Date: 10/02/2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        Random r = new Random(); 
 
        for(int i = 0; i < magicHand.length; i++) {
            int value = r.nextInt(13) + 1;
            String suit = Card.SUITS[r.nextInt(4)];

            Card card = new Card(value, suit);
            magicHand [i] = card;

            
        }

        
        System.out.println("Here are 7: ");
        for (Card card: magicHand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }

        
        System.out.print("Enter a card : ");
        int value = input.nextInt();
        System.out.print("Pick a suit : ");
        int suit = input.nextInt();
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }

        Card userguess = new Card(value, Card.SUITS[suit - 1]);

        
        boolean ans = false;
        
        Card luckyCard = new Card(9, "Hearts");
        
            for (Card card: magicHand) {
                if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                   ans = true;
                   break;
            }
        }

        
        String response = ans ? "Right guess!": "Wrong guess";
        System.out.println(response);
        //This is a test
        
        System.out.print("\n");
        if (answer) {
            System.out.println("You win!");
        } else {
            System.out.println("You Lose ");
        }
    }
    
}
