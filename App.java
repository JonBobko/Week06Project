package Week06Project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card("Ace", "Spades", 14); 
		//instantiating a card to test code so far 
		card.describe();
		//testing describe method 
		
		Deck deck = new Deck();
		deck.describe();
		
		Player player = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player.draw();
			}
			else {
				player2.draw();
			}
		}
		for (int i = 0; i < 26; i++) {
		(player.flip()).describe();
		player2.flip().describe();
		if (player.value > player2.value) {
			player.incrementScore();
			System.out.println("Player1 recieved a point");
		}else if(player.value < player2.value) {
			player2.incrementScore();
			System.out.println("Player2 recieved a point");
		}else if(player.value == player2.value) {
			System.out.println("No point was awarded");
		}
		}
		
		if (player.score > player2.score) {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nPlayer 1 is the winner!");
		}else if(player.score < player2.score) {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nPlayer 2 is the winner!");
		}else {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nIt's a tie!");
		}
		
		
	}

}
