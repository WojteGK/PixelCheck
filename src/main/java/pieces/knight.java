package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Knight extends Piece {

   public Knight(boolean isWhite) {
      super(isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position oldPosition, Position newPosition) {
      int deltaX = Math.abs(newPosition.getX() - oldPosition.getX());
      int deltaY = Math.abs(newPosition.getY() - oldPosition.getY());
      
      return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
   }

   @Override
   public char getSymbol() {
      return 'N';
   }
   
}