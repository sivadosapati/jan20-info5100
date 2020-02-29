package class8;

public class ChessPlayer extends BaseObject {

	String name;
	ChessPlayer opponent;
	boolean myTurn = false;

	ChessPlayer(String name) {
		this.name = name;
	}

	public void setOpponent(ChessPlayer opponent) {
		this.opponent = opponent;
	}

	public void play() {
		int rounds = 0;
		while (true) {
			if (rounds == 20) {
				break;
			}
			if (isMyTurnToPlay()) {
				rounds++;
				int x = 1000 + getRandomNumber(1000);
				System.out.println(name + " is thiking for their next move for " + x + " ms");
				pause(x);
				System.out.println(name + " has made a move");
				this.setMyTurnToPlay(false);
				this.opponent.setMyTurnToPlay(true);
				synchronized (opponent) {
					this.opponent.notify();
				}

			} else {
				try {
					synchronized (this) {
						this.wait();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}

	public void setMyTurnToPlay(boolean b) {
		this.myTurn = b;
	}

	public boolean isMyTurnToPlay() {
		return myTurn;
	}

}
