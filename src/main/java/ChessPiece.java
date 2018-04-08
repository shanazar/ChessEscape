import java.util.ArrayList;

public abstract class ChessPiece {
    private int row;
    private int column;
    private String color;
    Board board;
    ArrayList<String> possibleMoves;

    public ChessPiece(int row, int column, String color, Board board) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.board = board;
    }
}
