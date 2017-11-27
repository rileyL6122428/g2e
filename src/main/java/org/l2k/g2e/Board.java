package org.l2k.g2e;

import java.util.List;

public class Board {
	
	private List<List<BoardSpace>> rows;
	
	public Board(List<List<BoardSpace>> rows) {
		this.rows = rows;
	}

	public int getWidth() {
		return rows.get(0).size();
	}

	public int getLength() {
		return rows.size();
	}

	public BoardSpace getSpaceAt(int x, int y) {
		return rows.get(y).get(x);
	}

}
