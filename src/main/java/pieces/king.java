package src.main.java.pieces;

import src.main.java.Position;
import src.main.java.Piece;

public class King extends Piece {
    private boolean hasBeenChecked;
    private boolean hasMoved;

    public King(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        int yPosDifference = Math.abs(newPosition.getY() - this.getPosition().getY());
        int xPosDifference = Math.abs(newPosition.getX() - this.getPosition().getX());
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
}