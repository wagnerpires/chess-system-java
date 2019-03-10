package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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

	protected boolean isThereOpponentPiece(Position position) {		/** Acessível somente pelo mesmo pacote e pelas subclasses que são as peças (protected) */
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
}
