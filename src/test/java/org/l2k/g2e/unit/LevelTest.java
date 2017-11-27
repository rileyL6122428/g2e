package org.l2k.g2e.unit;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.l2k.g2e.Board;
import org.l2k.g2e.Level;
import org.l2k.g2e.TurnManager;
import org.mockito.Mock;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LevelTest {
	
	private Level level;
	
	@Mock
	private TurnManager turnManager;
	
	@Mock
	private Board board;

	@BeforeEach
	public void setup() {
		level = new Level(
			turnManager,
			board
		);
	}
	
	@Test
	public void endTurnDelegatesToTheTurnManager() {
		level.endTurn();
		verify(turnManager).endTurn();
	}
	
	@Test
	public void getTurnDelegatesToTheTurnManager() {
		level.endTurn();
		verify(turnManager).endTurn();
	}
	
	@Test
	public void getDimensionsDelegatesToBoard() {
		level.getDimensions();
		verify(board).getDimensions();
	}
	
}
