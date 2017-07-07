import java.util.ArrayList;
import java.util.Scanner;


public class HandEvaluator {

	
	ArrayList<String> onTable = new ArrayList<String>();
	
	Players players = new Players();
	Scanner userI = new Scanner(System.in);
	
	private void HandMode(int HandModeID, int playerID){
		
		switch(HandModeID){
			case 1: highCard(playerID);
		}
		
	}

	

	public void cardOnTable(){
		System.out.println(onTable.toString());
	}
	
	//Retrieve the Current Card on Table
	private void getCurrentCard(){
		
	}
	
	private void highCard(int playerID){
		players.getPlayer1hand();
		
	}
	
}
