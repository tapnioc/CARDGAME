/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and 
 * then asks the user to pick a card and searches the array of cards for the
 * match to the user's card. To be used as starting code in ICE 1
 * Christian Tapnio 991359879
 * @author srinivsi
 */
public class CardTrick {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Card[] magicHand = new Card[7];

		for (int i = 0; i < magicHand.length; i++) {
			Card c = new Card();
			c.setValue(c.randomValueGen());
			c.setSuit(Card.SUITS[c.randomSuitGen()]);
			magicHand[i] = c;
			System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
		}
		
		Boolean found = false;

		System.out.println("Enter Card Suit: ");
		String suit = k.next();

		System.out.println("Enter Card Value: ");
		int value = k.nextInt();

		for (int sub = 0; sub < magicHand.length; sub++) {
			if ((magicHand[sub].getSuit().equalsIgnoreCase(suit)) 
					&& (magicHand[sub].getValue() == (value))) {
				found = true;
				break;
			}
		}
		if (found = true) {
			System.out.println("The card you entered is found");
		} else {
			System.out.println("The card you entered is not found");
		}

	}

}
