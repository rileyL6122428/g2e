package org.l2k.g2e.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
	public void getWidthDelegatesToBoard() {
		when(board.getWidth()).thenReturn(3);
		int width = level.getWidth();
		assertEquals(3, width);
	}
	
	@Test
	public void getLengthDelegatesToBoard() {
		when(board.getLength()).thenReturn(5);
		int length = level.getLength();
		assertEquals(5, length);
	}
	
}
