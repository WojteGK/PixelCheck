package src.main.java;
import src.main.java.pieces.*;
import java.util.ArrayList;
import java.util.List;

public class PieceSet {

    private List<Piece> pieces = new ArrayList<>();

    public PieceSet(boolean isWhite) {
        // Initialize pawns
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(isWhite));
        }

        // Initialize rooks, knights, bishops, queen, and king
        pieces.add(new Rook(isWhite));
        pieces.add(new Knight(isWhite));
        pieces.add(new Bishop(isWhite));
        pieces.add(new Queen(isWhite));
        pieces.add(new King(isWhite));
        pieces.add(new Bishop(isWhite));
        pieces.add(new Knight(isWhite));
        pieces.add(new Rook(isWhite));
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}