package src.main.java;

import src.main.java.pieces.Bishop;
import src.main.java.pieces.King;
import src.main.java.pieces.Knight;
import src.main.java.pieces.Pawn;
import src.main.java.pieces.Queen;
import src.main.java.pieces.Rook;

public class Game {
    private Board board;
    private Piece[] pieces;

    public Game() {
        this.board = new Board();
        this.pieces = initializePieces();
    }

    public Piece[] initializePieces() {
    Piece[] pieces = new Piece[32];
    // white pieces    
    pieces[0] = new Rook(new Position(0, 0), true);
    pieces[1] = new Knight(new Position(1, 0), true);
    pieces[2] = new Bishop(new Position(2, 0), true);
    pieces[3] = new Queen(new Position(3, 0), true);
    pieces[4] = new King(new Position(4, 0), true);
    pieces[5] = new Bishop(new Position(5, 0), true);
    pieces[6] = new Knight(new Position(6, 0), true);
    pieces[7] = new Rook(new Position(7, 0), true);
    for (int x = 0; x < 8; x++) {
        pieces[x + 8] = new Pawn(new Position(x, 1), true);
    }
    // black pieces
    pieces[16] = new Rook(new Position(0, 7), false);
    pieces[17] = new Knight(new Position(1, 7), false);
    pieces[18] = new Bishop(new Position(2, 7), false);
    pieces[19] = new Queen(new Position(3, 7), false);
    pieces[20] = new King(new Position(4, 7), false);
    pieces[21] = new Bishop(new Position(5, 7), false);
    pieces[22] = new Knight(new Position(6, 7), false);
    pieces[23] = new Rook(new Position(7, 7), false);
    for (int x = 0; x < 8; x++) {
        pieces[x + 24] = new Pawn(new Position(x, 6), false);
    }
    return pieces;

}

    public Board getBoard() {
        return board;
    }

    public Piece[] getPieces() {
        return pieces;
    }
}