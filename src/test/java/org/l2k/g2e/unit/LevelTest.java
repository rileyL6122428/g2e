package org.l2k.g2e.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.l2k.g2e.Level;
import org.l2k.g2e.TurnManager;
import org.mockito.Mock;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LevelTest {
	
	private Level level;
	
	@Mock
	private TurnManager turnManager;

	@BeforeEach
	public void setup() {
		level = new Level(turnManager);
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

}
