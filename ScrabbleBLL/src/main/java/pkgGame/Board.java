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
		// TODO: Call SetBonus() to set the original bonus setup
		// TODO: Create the default puzzle
		// TODO: Loop through each place in the puzzle, insert a 'space' object, value
		// the BonusSquare
		// object if there's a bonus in that cell.
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
		// TODO: Set the bonus squares. Use the default / class Scrabble settings.
		this.puzzle[14][0] = new Space(new BonusSquare(14,0, eBonusType.TripleWord));
		this.puzzle[14][3] = new Space(new BonusSquare(14,3, eBonusType.DoubleLetter));
		this.puzzle[14][7] = new Space(new BonusSquare(14,7, eBonusType.TripleWord));
		this.puzzle[14][11] = new Space(new BonusSquare(14,11, eBonusType.DoubleLetter));
		this.puzzle[14][14] = new Space(new BonusSquare(14,14, eBonusType.TripleWord));
		this.puzzle[13][1] = new Space(new BonusSquare(13,1, eBonusType.DoubleWord));
		this.puzzle[13][5] = new Space(new BonusSquare(13,5, eBonusType.TripleLetter));
		this.puzzle[13][9] = new Space(new BonusSquare(13,9, eBonusType.TripleLetter));
		this.puzzle[13][13] = new Space(new BonusSquare(13,13, eBonusType.DoubleWord));
		this.puzzle[12][2] = new Space(new BonusSquare(12,2, eBonusType.DoubleWord));
		this.puzzle[12][6] = new Space(new BonusSquare(12,6, eBonusType.DoubleLetter));
		this.puzzle[12][8] = new Space(new BonusSquare(12,8, eBonusType.DoubleLetter));
		this.puzzle[12][12] = new Space(new BonusSquare(12,12, eBonusType.DoubleWord));












	}

}
