package src.main.java.pieces;

import src.main.java.Piece;
import src.main.java.Position;

public class Bishop extends Piece {

   public Bishop(Position position, boolean isWhite) {
      super(position, isWhite);
      //TODO Auto-generated constructor stub
   }

   @Override
   public boolean isValidMove(Position newPosition) {
      // Calculate the difference between the current position and the new position
      int deltaX = Math.abs(newPosition.getX() - this.getPosition().getX());
      int deltaY = Math.abs(newPosition.getY() - this.getPosition().getY());

      // A Bishop can move any number of squares diagonally
      return deltaX == deltaY;
   }
   
}