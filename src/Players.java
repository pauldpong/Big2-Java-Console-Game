import java.util.ArrayList;
import java.util.Arrays;

public class Players {
	
	Deck deck = new Deck();
	
	static ArrayList<String> player1hand = new ArrayList<String>();
	static ArrayList<String> player2hand = new ArrayList<String>();
	static ArrayList<String> player3hand = new ArrayList<String>();
	static ArrayList<String> player4hand = new ArrayList<String>();
	int tempnum[] = new int[13]; 
	
	public void CreatePlayerHands() {
		
		deck.shuffle();
		for(int i = 0; i < 52; i+=4){
		player1hand.add(deck.deck[i]);
		}
		for(int i = 1; i < 52; i+=4){
		player2hand.add(deck.deck[i]);
		}
		for(int i = 2; i < 52; i+=4){
		player3hand.add(deck.deck[i]);
		}
		for(int i = 3; i < 52; i+=4){
		player4hand.add(deck.deck[i]);
		}
	}
	
	//displays hands
	public void displayPlayersHand(int playerid){
		switch(playerid){
			case 1:
				System.out.println("");
				System.out.println(player1hand.toString());
				break;
			case 2: 
				System.out.println("");
				System.out.println(player2hand.toString());
				break;
			case 3:
				System.out.println("");
				System.out.println(player3hand.toString());
				break;
			case 4:
				System.out.println("");
				System.out.println(player4hand.toString());
				break;
		}
	}
	
	//getters
	
	
	public static ArrayList<String> getPlayer1hand() {
		return player1hand;
	}

	public static void setPlayer1hand(ArrayList<String> player1hand) {
		Players.player1hand = player1hand;
	}

	public void handSort(int playerindex){
		
		switch (playerindex){
		case 1: for (int i = 0; i < player1hand.size(); i++){
			String temp = player1hand.get(i);
			tempnum[i] = deck.decklist.indexOf(temp);
		} //end of for loop to put index into array
		
		
		//Sorts array by index
		Arrays.sort(tempnum);
		player1hand.removeAll(player1hand);
		
		
		//puts the sorted array back into the card forms
		for (int i = 0; i < 13; i++){
			player1hand.add(deck.decklist.get(tempnum[i]));
		}
		
		
		
		case 2: for (int i = 0; i < player2hand.size(); i++){
			String temp = player2hand.get(i);
			tempnum[i] = deck.decklist.indexOf(temp);
		}
		
		Arrays.sort(tempnum);
		player2hand.removeAll(player2hand);
		
		for (int i = 0; i < 13; i++){
			player2hand.add(deck.decklist.get(tempnum[i]));
		} 
		
		
		case 3: for (int i = 0; i < player3hand.size(); i++){
			String temp = player3hand.get(i);
			tempnum[i] = deck.decklist.indexOf(temp);
		}
		
		Arrays.sort(tempnum);
		player3hand.removeAll(player3hand);
		
		for (int i = 0; i < 13; i++){
			player3hand.add(deck.decklist.get(tempnum[i]));
		}
		
		case 4: for (int i = 0; i < player4hand.size(); i++){
			String temp = player4hand.get(i);
			tempnum[i] = deck.decklist.indexOf(temp);
		}
		
		Arrays.sort(tempnum);
		player4hand.removeAll(player4hand);
		
		for (int i = 0; i < 13; i++){
			player4hand.add(deck.decklist.get(tempnum[i]));
		}
	}//end of switch
		
} //end of handSort


} // end of players
