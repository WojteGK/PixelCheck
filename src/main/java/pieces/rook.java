package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Rook extends Piece {
   public Rook(Position position, boolean isWhite) {
      super(position, isWhite);
      //TODO Auto-generated constructor stub
   }

   private boolean hasMoved;

   public boolean getHasMoved() {
      return hasMoved;
   }

   public void setHasMoved(boolean hasMoved) {
      this.hasMoved = hasMoved;
   }

   @Override
   public boolean isValidMove(Position newPosition) {
      // Calculate the difference between the current position and the new position
      int deltaX = Math.abs(newPosition.getX() - this.getPosition().getX());
      int deltaY = Math.abs(newPosition.getY() - this.getPosition().getY());

      // A Rook can move any number of squares along a rank or file
      return deltaX == 0 || deltaY == 0;
   }
}