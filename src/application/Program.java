package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		//Projeto jogo de xadrez em java iniciado em 07/03/2019 - 05:53hs
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}
}
