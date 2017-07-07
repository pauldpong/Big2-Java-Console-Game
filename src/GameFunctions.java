import java.util.Scanner;

public class GameFunctions {
	
	
	private static String player1name = null;
	private static String player2name = null;
	private static String player3name = null;
	private static String player4name = null;
	static int starterindex = 0;
	
	Players players = new Players();
	static Deck deck = new Deck();
	Scanner userInput = new Scanner(System.in);
	
	public GameFunctions(){
		
	}
	
	public void spaces(){
		for (int j = 0; j < 40; j++){
			System.out.println("");
		}
		for (int i = 0; i < 45; i++){
			System.out.print("-");
		}
		System.out.println(" ");
	}
	
		public void setUsername(){
			for(int i = 1; i <= Start.numOfPlayers; i++){
			System.out.println("Enter the name for Player " + i);
			switch(i){
			case 1: player1name = userInput.nextLine(); break;
			case 2: player2name = userInput.nextLine(); break;
			case 3: player3name = userInput.nextLine(); break;
			case 4: player4name = userInput.nextLine(); break;
			}
		}
	}
		
		public String displayUsername(int playerid){
			switch(playerid){
			case 1: return player1name; 
			case 2: return player2name; 
			case 3: return player3name; 
			case 4: return player4name;
			}
			return "Unknown";
		}
		
		
		public void whosFirst(){
			if (players.player1hand.get(0).equals(deck.decklist.get(0))){
				System.out.println(player1name + " goes first!");
				starterindex = 1;
				
			} else if(players.player2hand.get(0).equals(deck.decklist.get(0))){
				System.out.println(player2name + " goes first!");
				starterindex = 2;
				
			} else if(players.player3hand.get(0).equals(deck.decklist.get(0))){
				System.out.println(player3name + " goes first!");
				starterindex = 3;
				
			} else if(players.player4hand.get(0).equals(deck.decklist.get(0))){
				System.out.println(player4name + " goes first!");
				starterindex = 4;
				
			} else { System.out.println("Wow, no one has the 3 of diamonds, the game is broken :(");}
		}
	
		
		
	
}
