package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Cell;
import main.MainPanel;

public class GameOfLifeTest {
	
	
	@Test
	public void testAliveCellToString(){
		Cell cell = new Cell(true);
		assertEquals("X", cell.toString());
	}
	
	@Test
	public void testDeadCellToString(){
		Cell cell = new Cell();
		assertEquals(".", cell.toString());
	}
	
	@Test
	public void testBeenAliveCellToString(){
		Cell cell = new Cell(true);
		cell.setAlive(false);
		assertEquals(".", cell.toString());
	}
	
}
