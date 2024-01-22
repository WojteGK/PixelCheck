package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Bishop extends Piece {

   public Bishop(boolean isWhite) {
      super(isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position oldPosition, Position newPosition) {
      // Calculate the difference between the current position and the new position
      int deltaX = Math.abs(newPosition.getX() - oldPosition.getX());
      int deltaY = Math.abs(newPosition.getY() - oldPosition.getY());

      // A Bishop can move any number of squares diagonally
      return deltaX == deltaY;
   }

   @Override
   public char getSymbol() {
      return 'B';
   }
   
}