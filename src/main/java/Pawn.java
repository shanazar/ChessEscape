import java.util.ArrayList;

public class Pawn extends ChessPiece {
    private ArrayList<String> possibleMoves = new ArrayList<String>();

    public Pawn(int row, int column, String color, Board board) {
        super(row, column, color, board);
        if (color.equals("black")) {
            possibleMoves = calculatePossibleMovesSouth(board);
        } else {
            if (color.equals("white")) {
                possibleMoves=calculatePossibleMovesNorth()
            }
        }
    }
}