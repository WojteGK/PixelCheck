package src.main.java;
import src.main.java.Game;
import src.main.java.Piece;
import src.main.java.Position;
import src.main.java.Board;
import src.main.java.pieces.*;


public class Move {
    private Piece piece;
    private Position oldPosition;
    private Position newPosition;
    private Board board;

    public Move(Piece piece,Position oldPosition, Position newPosition) {
        this.piece = piece;
        this.newPosition = newPosition;
    }

    public Piece getPiece() {
        return piece;
    }

    public Position getNewPosition() {
        return newPosition;
    }
    public boolean checkMove() {
        // Check if the move is valid for the piece
        if (!piece.isValidMove(oldPosition, newPosition)) {
            return false;
        }
    
        // Check if the new position is occupied by a piece of the same color
        Piece pieceAtNewPosition = board.getPieceAt(newPosition);
        if (pieceAtNewPosition != null && pieceAtNewPosition.isWhite() == piece.isWhite()) {
            return false;
        }
    
        // If the piece is a pawn, check if the move is a valid capture or non-capture move
        if (piece instanceof Pawn) {
            if (pieceAtNewPosition != null) {
                // The move is a capture move
                if (((Pawn) piece).isValidMove(oldPosition, newPosition)) {
                    // Remove the captured piece from the board
                    board.removePieceAt(newPosition);
                    return true;
                } else {
                    return false;
                }
            } else {
                // The move is a non-capture move
                return ((Pawn) piece).isValidMove(oldPosition, newPosition);
            }
        }
    
        // If the piece is not a pawn or the move is valid for a pawn, return true
        return true;
    }
}