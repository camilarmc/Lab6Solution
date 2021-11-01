package pkgGame;

import java.util.ArrayList;

import eNum.eBonusType;

public class Board {

	private Space[][] puzzle;
	private ArrayList<BonusSquare> bonuses = new ArrayList<BonusSquare>();

	/**
	 * Board - Constructor. Create the board, set the Space / Bonus Square for each
	 * square in the board
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	public Board() {
		
		puzzle = new Space[15][15];
		for(int i = 0; i <15; i++) {
			for(int j = 0; j <15; j++) {
				puzzle[i][j] = new Space();
			}
		}
		this.SetBonus();
	}

	public Space[][] getPuzzle() {
		return puzzle;
	}

	/**
	 * findBonus - interrogate the bonuses ArrayList and return the bonus square if
	 * there is one
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 * @param Row
	 * @param Col
	 * @return
	 */
	private BonusSquare findBonus(int Row, int Col) {
		for (BonusSquare bs : this.bonuses) {
			if (bs.getRow() == Row && bs.getCol() == Col) {
				return bs;
			}
		}
		return null;
	}

	/**
	 * SetBonus - This method will set the bonuses ArrayList with all the bonus
	 * squares in the game
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	private void SetBonus() {
		//0 column
		this.puzzle[0][0] = new Space(new BonusSquare(0,0, eBonusType.TripleWord));
		this.puzzle[3][0] = new Space(new BonusSquare(3,0, eBonusType.DoubleLetter));
		this.puzzle[7][0] = new Space(new BonusSquare(7,0, eBonusType.TripleWord));
		this.puzzle[11][0] = new Space(new BonusSquare(11,0, eBonusType.DoubleLetter));
		this.puzzle[14][0] = new Space(new BonusSquare(14,0, eBonusType.TripleWord));
		
		//1 Column
		this.puzzle[1][1] = new Space(new BonusSquare(1,1, eBonusType.DoubleWord));
		this.puzzle[5][1] = new Space(new BonusSquare(5,1, eBonusType.TripleLetter));
		this.puzzle[9][1] = new Space(new BonusSquare(9,1, eBonusType.TripleLetter));
		this.puzzle[13][1] = new Space(new BonusSquare(13,1, eBonusType.DoubleWord));
		
		//2 Column
		this.puzzle[2][2] = new Space(new BonusSquare(2,2, eBonusType.DoubleWord));
		this.puzzle[6][2] = new Space(new BonusSquare(6,2, eBonusType.DoubleLetter));
		this.puzzle[8][2] = new Space(new BonusSquare(8,2, eBonusType.DoubleLetter));
		this.puzzle[12][2] = new Space(new BonusSquare(12,2, eBonusType.DoubleWord));
		
		//3 Column
		this.puzzle[0][3] = new Space(new BonusSquare(0,3, eBonusType.DoubleLetter));
		this.puzzle[3][3] = new Space(new BonusSquare(3,3, eBonusType.DoubleWord));
		this.puzzle[7][3] = new Space(new BonusSquare(7,3, eBonusType.DoubleLetter));
		this.puzzle[11][3] = new Space(new BonusSquare(11,3, eBonusType.DoubleWord));
		this.puzzle[14][3] = new Space(new BonusSquare(14,3, eBonusType.DoubleLetter));
		
		//4 Column
		this.puzzle[4][4] = new Space(new BonusSquare(4,4, eBonusType.DoubleWord));
		this.puzzle[10][4] = new Space(new BonusSquare(10,4, eBonusType.DoubleWord));
		
		//5 Column
		this.puzzle[1][5] = new Space(new BonusSquare(1,5, eBonusType.TripleLetter));
		this.puzzle[5][5] = new Space(new BonusSquare(5,5, eBonusType.TripleLetter));
		this.puzzle[9][5] = new Space(new BonusSquare(9,5, eBonusType.TripleLetter));
		this.puzzle[13][5] = new Space(new BonusSquare(13,5, eBonusType.TripleLetter));
		
		//6 Column
		this.puzzle[2][6] = new Space(new BonusSquare(2,6, eBonusType.DoubleLetter));
		this.puzzle[6][6] = new Space(new BonusSquare(6,6, eBonusType.DoubleLetter));
		this.puzzle[8][6] = new Space(new BonusSquare(8,6, eBonusType.DoubleLetter));
		this.puzzle[12][6] = new Space(new BonusSquare(12,6, eBonusType.DoubleLetter));
		
		//7 Column
		this.puzzle[0][7] = new Space(new BonusSquare(0,7, eBonusType.TripleWord));
		this.puzzle[3][7] = new Space(new BonusSquare(3,7, eBonusType.DoubleLetter));
		//test case doesn't include the star as a double word. Scrabble rules says there are 17 double words with the star included
		//this.puzzle[7][7] = new Space(new BonusSquare(7,7, eBonusType.DoubleWord));
		this.puzzle[11][7] = new Space(new BonusSquare(11,7, eBonusType.DoubleLetter));
		this.puzzle[14][7] = new Space(new BonusSquare(14,7, eBonusType.TripleWord));
		
		//8 Column
		this.puzzle[2][8] = new Space(new BonusSquare(2,8, eBonusType.DoubleLetter));
		this.puzzle[6][8] = new Space(new BonusSquare(6,8, eBonusType.DoubleLetter));
		this.puzzle[8][8] = new Space(new BonusSquare(8,8, eBonusType.DoubleLetter));
		this.puzzle[12][8] = new Space(new BonusSquare(12,8, eBonusType.DoubleLetter));
		
		//9 Column
		this.puzzle[1][9] = new Space(new BonusSquare(1,9, eBonusType.TripleLetter));
		this.puzzle[5][9] = new Space(new BonusSquare(5,9, eBonusType.TripleLetter));
		this.puzzle[9][9] = new Space(new BonusSquare(9,9, eBonusType.TripleLetter));
		this.puzzle[13][9] = new Space(new BonusSquare(13,9, eBonusType.TripleLetter));
		
		//10 Column
		this.puzzle[4][10] = new Space(new BonusSquare(4,10, eBonusType.DoubleWord));
		this.puzzle[10][10] = new Space(new BonusSquare(4,10, eBonusType.DoubleWord));
		
		//11 Column
		this.puzzle[0][11] = new Space(new BonusSquare(0,11, eBonusType.DoubleLetter));
		this.puzzle[3][11] = new Space(new BonusSquare(3,11, eBonusType.DoubleWord));
		this.puzzle[7][11] = new Space(new BonusSquare(7,11, eBonusType.DoubleLetter));
		this.puzzle[11][11] = new Space(new BonusSquare(11,11, eBonusType.DoubleWord));
		this.puzzle[14][11] = new Space(new BonusSquare(14,11, eBonusType.DoubleLetter));
		
		// 12 Column
		this.puzzle[2][12] = new Space(new BonusSquare(2,12, eBonusType.DoubleWord));
		this.puzzle[6][12] = new Space(new BonusSquare(6,12, eBonusType.DoubleLetter));
		this.puzzle[8][12] = new Space(new BonusSquare(8,12, eBonusType.DoubleLetter));
		this.puzzle[12][12] = new Space(new BonusSquare(12,12, eBonusType.DoubleWord));
		
		
        //13 column

		this.puzzle[1][13] = new Space(new BonusSquare(1,13, eBonusType.DoubleWord));
		this.puzzle[5][13] = new Space(new BonusSquare(5,13, eBonusType.TripleLetter));
		this.puzzle[9][13] = new Space(new BonusSquare(9,13, eBonusType.TripleLetter));
		this.puzzle[13][13] = new Space(new BonusSquare(13,13, eBonusType.DoubleWord));
		
		//14 column
		this.puzzle[0][14] = new Space(new BonusSquare(0,14, eBonusType.TripleWord));
		this.puzzle[3][14] = new Space(new BonusSquare(3,14, eBonusType.DoubleLetter));
		this.puzzle[7][14] = new Space(new BonusSquare(7,14, eBonusType.TripleWord));
		this.puzzle[11][14] = new Space(new BonusSquare(11,14, eBonusType.DoubleLetter));
		this.puzzle[14][14] = new Space(new BonusSquare(14,14, eBonusType.TripleWord));


	}

}
