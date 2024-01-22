package src.main.java;

public abstract class Piece {
    
    private boolean isWhite;

    public Piece( boolean isWhite) {
        
        this.isWhite = isWhite;
    }   

    public boolean isWhite() {
        return isWhite;
    }

    // This method should be overridden by each specific piece type
    public abstract boolean isValidMove(Position oldPosition, Position newPosition);

    public abstract char getSymbol();
}