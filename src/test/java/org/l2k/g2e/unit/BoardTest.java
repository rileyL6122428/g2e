package org.l2k.g2e.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.l2k.g2e.Board;
import org.l2k.g2e.BoardBuilder;
import org.l2k.g2e.BoardSpace;

class BoardTest {
	
	private Board board;
	
	private List<BoardSpace> rowOne;
	private List<BoardSpace> rowTwo;
	
	@BeforeEach
	public void setup() {
		rowOne = Arrays.asList(new BoardSpace(), new BoardSpace(), new BoardSpace());
		rowTwo = Arrays.asList(new BoardSpace(), new BoardSpace(), new BoardSpace());
		
		board = new BoardBuilder()
				.addRow(rowOne)
				.addRow(rowTwo)
				.build();
	}
	
	@Test
	public void instantiatesWithRowsOfSpacesPushedFromBottomToTop() {
		assertEquals(rowOne.get(0), board.getSpaceAt(0, 0));
		assertEquals(rowOne.get(1), board.getSpaceAt(1, 0));
		assertEquals(rowOne.get(2), board.getSpaceAt(2, 0));
		
		assertEquals(rowTwo.get(0), board.getSpaceAt(0, 1));
		assertEquals(rowTwo.get(1), board.getSpaceAt(1, 1));
		assertEquals(rowTwo.get(2), board.getSpaceAt(2, 1));
	}
	
	@Test
	public void getLengthReturnsTheNumberOfRows() {
		assertEquals(2, board.getLength());
	}
	
	@Test
	public void getWidthReturnsTheWidthOfTheFirstRow() {
		assertEquals(3, board.getWidth());
	}

}
