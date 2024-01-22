package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Queen extends Piece {

   public Queen(boolean isWhite) {
      super(isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position oldPosition, Position newPosition) {
      // Calculate the difference between the current position and the new position
      int deltaX = Math.abs(newPosition.getX() - oldPosition.getX());
      int deltaY = Math.abs(newPosition.getY() - oldPosition.getY());

      // A Queen can move any number of squares along a rank, file, or diagonal
      return deltaX == 0 || deltaY == 0 || deltaX == deltaY;
   }

   @Override
   public char getSymbol() {
      return 'Q';
   }
    
}