package src.main.java;

public class Board {
    private Position[][] positions;

    public Board() {
        positions = new Position[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                positions[x][y] = new Position(x, y);
            }
        }
    }
}

class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}