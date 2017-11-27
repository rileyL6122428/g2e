package org.l2k.g2e;

public class LevelBuilder {
	
	private Turn startingTurn;

	public Level build() {
		return new Level(
			new TurnManager(startingTurn),
			null
		);
	}


	public LevelBuilder setStartingTurn(Turn startingTurn) {
		this.startingTurn = startingTurn;
		return this;
	}


	public LevelBuilder setDimensions(Dimensions dimensions) {
		// TODO Auto-generated method stub
		return null;
	}

}
