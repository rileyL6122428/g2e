package org.l2k.g2e;

import java.util.List;

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


	public LevelBuilder setSpaces(List<BoardSpace>... rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
