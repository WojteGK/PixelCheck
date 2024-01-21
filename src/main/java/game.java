package src.main.java;

public class Game {
    private Board board;
    private Piece[] pieces;

    public Game() {
        this.board = new Board();
        this.pieces = initializePieces();
    }

    private Piece[] initializePieces() {
        // Initialize the pieces and return them
        // This could involve creating instances of King, Queen, Bishop, etc.
        // and placing them in their initial positions on the board
        return new Piece[0]; // Placeholder
    }

    public Board getBoard() {
        return board;
    }

    public Piece[] getPieces() {
        return pieces;
    }
}