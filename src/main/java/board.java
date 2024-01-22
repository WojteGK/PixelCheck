package src.main.java;

public class Board {
    Position[][] positions;

    public Board() {
        positions = new Position[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                positions[x][y] = new Position(x, y, null);
            }
        }
    }
    
    public Piece getPieceAt(Position position) {
        return positions[position.getX()][position.getY()].getPiece();
    }
   public void removePieceAt(Position newPosition) {
        positions[newPosition.getX()][newPosition.getY()].setPiece(null);
   }
}