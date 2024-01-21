package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Pawn extends Piece {

   public Pawn(Position position, boolean isWhite) {
      super(position, isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position newPosition) {
      int currentRow = getPosition().getY();
      int currentCol = getPosition().getX();
      int newRow = newPosition.getY();
      int newCol = newPosition.getX();

      // Check if the new position is one step forward
      if (isWhite()) {
         if (newRow == currentRow - 1 && newCol == currentCol) {
            return true;
         }
      } else {
         if (newRow == currentRow + 1 && newCol == currentCol) {
            return true;
         }
      }

      return false;
   }
   
}