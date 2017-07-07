import java.util.Scanner;
import java.util.ArrayList;


public class MainGame {
	
	Players players = new Players();
	Scanner userInput = new Scanner(System.in);
	GameFunctions game = new GameFunctions();
	int handcode;
	boolean loopflag = true;
	ArrayList<Integer> handcodeArray = new ArrayList<Integer>();
	ArrayList<String> currentHand = new ArrayList<String>();
	
	//temp
	boolean isCardValid = true;
	
	public MainGame(){
		
	}
	
	// zero can not be first, cant store zero 
	public void enterHand(int playerid){
		System.out.println("Enter your hand " + game.displayUsername(playerid));
		if(userInput.hasNextInt()){
			handcode = userInput.nextInt();
			storeHANDCODEIntoArray();
			currentCardDisplayandStore();
			removeCardsFromHand(playerid);
			
			//System.out.println(handcodeArray.toString());
			//flushHANDCODEArray();
			
		}
		
	} //end of enter hand
	//hand code refers to the index of the card they want to place down
	
	public void storeHANDCODEIntoArray(){
		String temp = Integer.toString(handcode);
		for (int i = 0; i < temp.length(); i++){
			handcodeArray.add(temp.charAt(i) - '0');
		}		
	}
	
	public void flushHANDCODEArray(){
		handcodeArray.removeAll(handcodeArray);
	}
	
	
	//need to check if the card is valid or not
	//TODO optimize the player handling system, in order to refer to the player's hands easier
	public void currentCardDisplayandStore(){
		if(isCardValid){
			for (int i = 0; i < handcodeArray.size(); i++){
				currentHand.add(players.player1hand.get(handcodeArray.get(i)));
				
				if(i == handcodeArray.size() - 1) {
					System.out.println(currentHand.toString());
				} else {
					continue;
				}
			}
			
		} else {
			System.out.println("The hand entered is invalid.");
		}
		
		
	}
	
	
	public void removeCardsFromHand(int playerID){
			String temp = "0";
			int tempnum = 0;
			switch(playerID){
			case 1: 
			//replace all the inputed places with zeros
			for(int i = 0; i < handcodeArray.size(); i++){
				int j = handcodeArray.get(i);
				players.player1hand.set(j, temp);
				tempnum++;
			}
			//remove the zero temp placeholders
			for(int i = 0; i < tempnum; i++){
			players.player1hand.remove("0");
			}
			tempnum = 0;
			break;
			case 2:
				for(int i = 0; i < handcodeArray.size(); i++){
					int j = handcodeArray.get(i);
					players.player2hand.set(j, temp);
					tempnum++;
				}
				for(int i = 0; i < tempnum; i++){
				players.player2hand.remove("0");
				}
				tempnum = 0;
				break;
			case 3: 
				for(int i = 0; i < handcodeArray.size(); i++){
					int j = handcodeArray.get(i);
					players.player3hand.set(j, temp);
					tempnum++;
				}
				for(int i = 0; i < tempnum; i++){
				players.player3hand.remove("0");
				}
				tempnum = 0;
				break;
			case 4: 
				for(int i = 0; i < handcodeArray.size(); i++){
					int j = handcodeArray.get(i);
					players.player4hand.set(j, temp);
					tempnum++;
				}
				for(int i = 0; i < tempnum; i++){
				players.player4hand.remove("0");
				}
				tempnum = 0;
				break;
			}
	} //end of removehand
	
	
	
	
	
	public void mainGameLoop(){
	//TODO Finish looping through players until loopflag == false, cycling through all players starting from starter
	//TODO make sure cards are removed perfectly, no bugs, then move on the current cards on 
		//table and the hand evaluator
		while(loopflag){
			for (int i = GameFunctions.starterindex; i <= 4; i++){
				enterHand(i);	
				players.displayPlayersHand(i);
				if(i == Start.numOfPlayers){
					i = 0;
				}	
				
			}
			
			
			
		} //end of while loop
	
	
		
		
		
	}

	
	
}
