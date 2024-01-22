package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class GameLog {
    private List<Move> moves;

    public GameLog() {
        moves = new ArrayList<>();
    }

    public void logMove(Move move) {
        moves.add(move);
    }

    public List<Move> getMoves() {
        return moves;
    }
}