package class8;

public class ChessGame {

	public static void main(String[] args) {
		ChessPlayer yash = new ChessPlayer("Yashaswini");
		ChessPlayer ekie = new ChessPlayer("Ekie");
		yash.setOpponent(ekie);
		ekie.setOpponent(yash);
		yash.setMyTurnToPlay(true);
		new Thread(() -> yash.play()).start();
		new Thread(() -> ekie.play()).start();
	}

}
