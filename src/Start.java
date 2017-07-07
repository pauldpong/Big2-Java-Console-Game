import java.util.Scanner;

public class Start {

	public static int numOfPlayers = 4;
	
	public static void main(String[] args){
		
		Players players = new Players();
		Scanner userInput = new Scanner(System.in);
		GameFunctions game = new GameFunctions();
		Deck deck = new Deck();
		MainGame main = new MainGame();
		HandEvaluator HE = new HandEvaluator();
		
		System.out.println("Welcome to Big Two!");
		System.out.println("This game requires 4 players.");
		System.out.println("Please create a username for each player.");
		
		players.CreatePlayerHands(); //Creates hands from a shuffled deck
		deck.fillDeckList();
		
		for(int k = 0; k < 45; k++){
			System.out.print("-");
		} //Prints lines
		System.out.println(" ");

		game.setUsername();

		System.out.println("Game is starting...");
		
		String enterkey = null;
		
			for(int i = 1; i <= numOfPlayers; i++){
				System.out.println("All players turn away, except for " + game.displayUsername(i));
				System.out.println("Press Enter when ready");
				
				enterkey = userInput.nextLine();
				switch(i){
				case 1: game.spaces();
						System.out.print(game.displayUsername(1) + ", this is your hand: "); 
						players.handSort(1);
						players.displayPlayersHand(1); break;
				case 2: game.spaces();
						System.out.print(game.displayUsername(2) + ", this is your hand: "); 
						players.handSort(2);
						players.displayPlayersHand(2); break;
				case 3: game.spaces();
						System.out.print(game.displayUsername(3) + ", this is your hand: "); 
						players.handSort(3);
						players.displayPlayersHand(3); break;
				case 4: game.spaces();
						System.out.print(game.displayUsername(4) + ", this is your hand: "); 
						players.handSort(4);
						players.displayPlayersHand(4); break;
				}
		} //end of for loop
			
		//start of game
		game.whosFirst();
		main.mainGameLoop();
		
		// main.mainGameLoop();

	}
}
