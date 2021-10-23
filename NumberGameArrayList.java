package project2;


import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class NumberGameArrayList implements NumberSlider {

	/** Board Height */
	private int height;

	/** Board Width */
	private int width;

	/** 2D Array for Board */
	private int[][] grid;

	/** Board winning value */
	private int winningValue;

	private ArrayList<Cell> cells;
	private Stack<ArrayList<Cell>> moves;

	private Random rgen;
	private GameStatus gameStatus;


	@Override
	public void resizeBoard(int height, int width, int winningValue) {
		if(!(winningValue % 2 == 0)){
			throw new IllegalArgumentException();
		}

		grid = new int[height][width];
		cells = new ArrayList<Cell>();
		this.winningValue = winningValue;
	}

	@Override
	public void reset() {

	}

	@Override
	public void setValues(int[][] ref) {

	}

	@Override
	public Cell placeRandomValue() {

		int rCol = rgen.nextInt(this.grid.length);
		int rRow = rgen.nextInt(this.grid[0].length);


		return null;
	}

	@Override
	public boolean slide(SlideDirection dir) {
		return false;
	}

	@Override
	public ArrayList<Cell> getNonEmptyTiles() {
		return null;
	}

	@Override
	public GameStatus getStatus() {
		return null;
	}

	@Override
	public void undo() {

	}
}
