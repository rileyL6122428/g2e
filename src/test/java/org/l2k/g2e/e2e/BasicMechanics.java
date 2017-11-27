package org.l2k.g2e.e2e;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.l2k.g2e.BoardSpace;
import org.l2k.g2e.Level;
import org.l2k.g2e.LevelBuilder;
import org.l2k.g2e.Turn;
import static java.util.Arrays.asList;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BasicMechanics {
	
	private Level level;
	
	@SuppressWarnings("unchecked")
	@BeforeEach
	public void setup() {
		level = new LevelBuilder()
				.setStartingTurn(Turn.PLAYER)
				.setSpaces(
					asList(new BoardSpace(), new BoardSpace(), new BoardSpace()),
					asList(new BoardSpace(), new BoardSpace(), new BoardSpace())
				)
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
	
	@Test
	public void levelDimensionsAreQueryable() {
		assertEquals(5, level.getWidth());
		assertEquals(6, level.getLength());
	}
	
	@Nested
	class PlayerTurn {
		
		@Disabled
		@Test
		public void playerCanMoveUnitManually() {
			
		}
	}

}
