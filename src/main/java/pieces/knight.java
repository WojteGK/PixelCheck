package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Knight extends Piece {

   public Knight(Position position, boolean isWhite) {
      super(position, isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position newPosition) {
      int deltaX = Math.abs(newPosition.getX() - getPosition().getX());
      int deltaY = Math.abs(newPosition.getY() - getPosition().getY());
      
      return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
   }
   
}