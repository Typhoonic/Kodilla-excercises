package com.kodilla.patterns.builder.checkers;

public class Board {

    public static final int MIN_INDEX = 0;
    public static final int MAX_INDEX = 9;
    private final Figure[][] board = new Figure[10][];

    public Board(){

        for(int i = 0; i < 10; i++){
            board[i] = new Figure[10];
        }

    }

    public Figure getFigure(int x, int y){
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y){
        board[x][y] = figure;
    }

    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[n][k] == null) {
                    result += "  ";
                } else {
                    result += (board[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[n][k]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }

}
