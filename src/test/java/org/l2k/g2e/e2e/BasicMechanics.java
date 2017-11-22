package org.l2k.g2e.e2e;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.l2k.g2e.Level;
import org.l2k.g2e.LevelBuilder;
import org.l2k.g2e.Turn;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BasicMechanics {
	
	private Level level;
	
	@BeforeEach
	public void setup() {
		level = new LevelBuilder()
				.setStartingTurn(Turn.PLAYER)
				.build();		
	}

	@Test
	public void levelAlternatesTurns() {
		assertEquals(Turn.PLAYER, level.getTurn());
		
		level.endTurn();
		assertEquals(Turn.COMPUTER, level.getTurn());
		
		level.endTurn();
		assertEquals(Turn.PLAYER, level.getTurn());
		
		level.endTurn();
		assertEquals(Turn.COMPUTER, level.getTurn());
	}

}
