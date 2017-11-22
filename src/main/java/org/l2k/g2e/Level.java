package org.l2k.g2e;

public class Level {

	private TurnManager turnManager;

	public Level(TurnManager turnManager) {
		this.turnManager = turnManager;
	}

	public void endTurn() {
		turnManager.endTurn();
	}

	public Turn getTurn() {
		return turnManager.getTurn();
	}

}
