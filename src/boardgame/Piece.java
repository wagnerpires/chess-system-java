package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;	/** Opcional... Por padr�o o java j� joga o valor nulo */
	}

	protected Board getBoard() {	/** Tabuleiro acess�vel somente por classes e subclasses dentro do mesmo pacote (protected) */
		return board;
	}

//	public void setBoard(Board board) {		/** set retirado para n�o permitir que o tabuleiro seja alterado */ 
//		this.board = board;
//	}
}
