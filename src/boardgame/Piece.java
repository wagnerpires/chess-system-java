package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {	/** Tabuleiro acessível somente por classes  e subclasses dentro do mesmo pacote (protected) */
		return board;
	}

//	public void setBoard(Board board) {
//		this.board = board;
//	}
	
	

}
