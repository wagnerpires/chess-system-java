package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {

	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

//	public void setColor(Color color) {		/** Método retirado para não permitir acesso à alteração de color
//		this.color = color;
//	}

}
