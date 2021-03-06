package org.l2k.g2e;

public class Level {

	private TurnManager turnManager;
	private Board board;

	public Level(TurnManager turnManager, Board board) {
		this.turnManager = turnManager;
		this.board = board;
	}

	public void endTurn() {
		turnManager.endTurn();
	}

	public Turn getTurn() {
		return turnManager.getTurn();
	}

	public int getWidth() {
		return board.getWidth();
	}

	public int getLength() {
		return board.getLength();
	}

}
