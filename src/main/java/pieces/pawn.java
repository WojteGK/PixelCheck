package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Pawn extends Piece {

   public Pawn(boolean isWhite) {
      super(isWhite);      
   }

   @Override
   public boolean isValidMove(Position oldPosition, Position newPosition) {
      int currentRow = oldPosition.getY();
      int currentCol = oldPosition.getX();
      int newRow = newPosition.getY();
      int newCol = newPosition.getX();
  
      // Check if the new position is one step forward
      if (isWhite()) {
          if (newRow == currentRow - 1 && newCol == currentCol && newPosition.getPiece() == null) {
              return true;
          }
          // Check for capture
          if (newPosition.getPiece() != null && newRow == currentRow - 1 && (newCol == currentCol - 1 || newCol == currentCol + 1)) {
              return true;
          }
      } else {
          if (newRow == currentRow + 1 && newCol == currentCol && newPosition.getPiece() == null) {
              return true;
          }
          // Check for capture
          if (newPosition.getPiece() != null && newRow == currentRow + 1 && (newCol == currentCol - 1 || newCol == currentCol + 1)) {
              return true;
          }
      }
  
      return false;
  }
   public Piece promoteTo(Class<? extends Piece> newPieceType) {
      Piece newPiece = null;
      try {
          // Create a new instance of the specified piece type
          newPiece = newPieceType.getDeclaredConstructor(boolean.class).newInstance(isWhite());
      } catch (Exception e) {
          e.printStackTrace();
      }
      return newPiece;
  }

   @Override
   public char getSymbol() {
      return 'P';
   }
   
}