package org.l2k.g2e;

import java.util.ArrayList;
import java.util.List;

public class BoardBuilder {
	
	private List<List<BoardSpace>> rows = new ArrayList<List<BoardSpace>>();

	public Board build() {
		return new Board(rows);
	}

	public BoardBuilder addRow(List<BoardSpace> row) {
		rows.add(row);
		return this;
	}

}
