package src.main.java.pieces;

import src.main.java.Position;
import src.main.java.Piece;

public class King extends Piece {
    private boolean hasBeenChecked;
    private boolean hasMoved;

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Position oldPosition, Position newPosition) {
        int yPosDifference = Math.abs(newPosition.getY() - oldPosition.getY());
        int xPosDifference = Math.abs(newPosition.getX() - oldPosition.getX());
        if (yPosDifference > 1 || xPosDifference > 1) {
            return false;
        }

        if (!hasMoved) {
            hasMoved = true;
        }
        return true;
    }

    public boolean hasBeenChecked() {
        return hasBeenChecked;
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    public void setHasBeenChecked(boolean hasBeenChecked) {
        this.hasBeenChecked = hasBeenChecked;
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public char getSymbol() {
        return 'K';
    }
}