package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount --;
	}
	
//	public void setColor(Color color) {		/** M�todo retirado para n�o permitir acesso � altera��o de color
//		this.color = color;
//	}

	protected boolean isThereOpponentPiece(Position position) {		/** Acess�vel somente pelo mesmo pacote e pelas subclasses que s�o as pe�as (protected) */
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
}
