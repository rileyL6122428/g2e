package org.l2k.g2e;

public class TurnManager {
	
	private Turn turn;

	public TurnManager(Turn startingTurn) {
		this.turn = startingTurn;
	}

	public void endTurn() {
		turn = (turn == Turn.PLAYER) ? Turn.COMPUTER : Turn.PLAYER;
	}

	public Turn getTurn() {
		return turn;
	}

}
