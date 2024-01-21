package src.main.java;

public abstract class Piece {
    private Position position;
    private boolean isWhite;

    public Piece(Position position, boolean isWhite) {
        this.position = position;
        this.isWhite = isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isWhite() {
        return isWhite;
    }

    // This method should be overridden by each specific piece type
    public abstract boolean isValidMove(Position newPosition);
}