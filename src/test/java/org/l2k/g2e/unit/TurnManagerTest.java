package org.l2k.g2e.unit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.l2k.g2e.Turn;
import org.l2k.g2e.TurnManager;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TurnManagerTest {
	
	private TurnManager turnManager;
	
	@BeforeEach
	public void setup() {
		turnManager = new TurnManager(Turn.PLAYER);
	}
	
	@Test
	public void endTurnTogglesTheCurrentTurn() {
		assertEquals(Turn.PLAYER, turnManager.getTurn());
		
		turnManager.endTurn();
		assertEquals(Turn.COMPUTER, turnManager.getTurn());
		
		turnManager.endTurn();
		assertEquals(Turn.PLAYER, turnManager.getTurn());
	}
	
}
