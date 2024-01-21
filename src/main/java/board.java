package src.main.java;

public class Board {
    Position[][] positions;

    public Board() {
        positions = new Position[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                positions[x][y] = new Position(x, y);
            }
        }
    }
}