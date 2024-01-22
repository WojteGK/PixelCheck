package src.main.java;

public class Position {
    private int x;
    private int y;
    private Piece piece;
        
    public Position(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }    

   public Piece getPiece() {
      return piece;
   }

    public void setPiece(Object object) {
        this.piece = (Piece) object; 
    }
}