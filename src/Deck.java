import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
	
		static String[] SUITS = {
				"♦", "♣", "♥", "♠"  //"♦", "♣", "♥", "♠" // "D", "C", "H", "S"
				};
		static String[] RANKS = {
				"3","4","5","6","7","8","9","10","J",
				"Q","K","A","2"
			};
				
		static int numberofCards = SUITS.length * RANKS.length;
		static String deck[] = new String[numberofCards];
		static ArrayList<String> decklist = new ArrayList<String>();
				
		
		public Deck(){
		for (int i = 0; i < RANKS.length; i++){
			for (int j = 0; j < SUITS.length; j++){
				deck[SUITS.length*i + j] = RANKS[i] + SUITS[j];
				}
			}
		}
		
		public void displayDeck(){
			for (int i = 0; i < numberofCards; i++){
			System.out.print(deck[i]);
			}
			System.out.println(" ");
		}
		
		public void fillDeckList(){
			for (int i = 0; i < RANKS.length; i++){
				for (int j = 0; j < SUITS.length; j++){
					decklist.add(RANKS[i] + SUITS[j]);
					}
				}
		}
		
		public void displayDeckList(){
			System.out.println(decklist);
		}
		
		public void shuffle(){
		for (int i = 0; i < numberofCards; i++){
			int rand = i + (int)(Math.random()* (numberofCards -i));
			String temp = deck[rand];
			deck[rand] = deck[i];
			deck[i] = temp;
			}
		
		}
		
		
		public void cardAtIndex(int cardIndex){
			System.out.println(decklist.get(cardIndex)); 
		}
		
		public int getNumofCards(){
			return numberofCards;
		}
		
		public String getSUITS(int indexS){
			switch (indexS){
			case 0: return SUITS[indexS];
			case 1: return SUITS[indexS];
			case 2: return SUITS[indexS];
			case 3: return SUITS[indexS];
			}
			return null;
		}
		
		public String[] getRANKS(){
			return RANKS;
		}
		
}
