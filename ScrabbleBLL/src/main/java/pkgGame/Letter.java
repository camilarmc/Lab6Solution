package pkgGame;

public class Letter {

	private Character chLetter;
	private int iScore;
	
	public Letter(Character chLetter) {
		super();
		this.chLetter = chLetter;
		SetDefaultScore(chLetter);
	}
	
	public Character getChLetter() {
		return chLetter;
	}

	public int getiScore() {
		return iScore;
	}

	private void SetDefaultScore(Character letter)
	{
		
		switch (chLetter) {
		case ' ':
			iScore = 0;
			break;
		case 'A','E','I','L','N','O','R','S','T','U':
			iScore = 1;
			break;
		case 'D','G':
			iScore = 2;
			break;
		case 'B','C','M','P':
			iScore = 3;
			break;
		case 'F','H','V','W','Y':
			iScore = 4;
			break;
		case 'K':
			iScore = 5;
			break;
		case 'J','X':
			iScore = 8;
			break;
		case 'Q','Z':
			iScore = 10;
			break;
		
		}
//		0 Points - Blank tile.
//		1 Point - A, E, I, L, N, O, R, S, T and U.
//		2 Points - D and G.
//		3 Points - B, C, M and P.
//		4 Points - F, H, V, W and Y.
//		5 Points - K.
//		8 Points - J and X.
//		10 Points - Q and Z.
	}
	
	
	
}
