import java.util.ArrayList;

public abstract class ChessPiece {
    private int row;
    private int column;
    private String color;
    private Board board;
    ArrayList<String> possibleMoves;

    public ChessPiece(int row, int column, String color, Board board) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.board = board;
    }

    public ArrayList<String> getPossibleMoves() {
        return possibleMoves;
    }
    //Funktsioonid, millega saab kontrollida, kas lineaarselt saab nupp liikuda ette/taha/vasakule paremale
    //Tagastab võimalikud käigud formaadis {"11","22"} jne
    public ArrayList<String> calculatePossibleMovesNorth(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        for (int i = row-1; i >=0; i--) {
            if (!board.isPiece(i,column)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return  possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesSouth(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        for (int i = row+1; i < 8; i++) {
            if (!board.isPiece(i,column)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesEast(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        for (int i = column-1; i >=0; i--) {
            if (!board.isPiece(row,i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;

    }
    public ArrayList<String> calculatePossibleMovesWest(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        for (int i =  column+1; i < 8; i++) {
            if (!board.isPiece(row,i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesNorthEast(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        int smallest;
        if (row<=column){
            smallest=row;
        }else{
            smallest=column;
        }
        for (int i =  1; i <smallest; i++) {
            if (!board.isPiece(row-i,column-i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesNorthWest(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        int smallest;
        if (row<=8-column){
            smallest=row;
        }else{
            smallest=column;
        }
        for (int i =  1; i <smallest; i++) {
            if (!board.isPiece(row-i,column+i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesSouthEast(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        int smallest;
        if (8-row<=column){
            smallest=row;
        }else{
            smallest=column;
        }
        for (int i =  1; i <smallest; i++) {
            if (!board.isPiece(row+i,column-i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
    public ArrayList<String> calculatePossibleMovesSouthWest(Board board){
        ArrayList<String> possibleMoves=new ArrayList<String>();
        int smallest;
        if (8-row<=8-column){
            smallest=row;
        }else{
            smallest=column;
        }
        for (int i =  1; i <smallest; i++) {
            if (!board.isPiece(row+i,column+i)){
                possibleMoves.add(Integer.toString(i)+Integer.toString(column));
            }else{
                break;
            }
        }
        return possibleMoves;
    }
}
