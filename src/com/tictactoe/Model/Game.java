package com.tictactoe.Model;

/**
 * Created by RENT on 2017-06-22.
 */
public class Game {


    private String[][] field;
    private String sign;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    private  int y;
    private int x;

    public String getSign() {
        return sign;
    }




    public String[][] getField() {

        return field;
    }

    public String[][] createField() {
        y = 3;
        x = 3;
        field = new String[x][y];


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                field[i][j] = String.valueOf(i) + " " + String.valueOf(j);
            }
        }

//        field[0][0] = "1";
//        field[0][1] = "2";
//        field[0][2] = "3";
//
//        field[1][0] = "4";
//        field[1][1] = "5";
//        field[1][2] = "6";
//
//
//        field[2][0] = "7";
//        field[2][1] = "8";
//        field[2][2] = "9";


        return field;
    }
//
//    public void putSomethingToTable(){
//    field[0][0] = "x";
//
//    }


    public String makeMove(int x, int y, int player) {


        if (!field[x][y].equals(" X ") && !field[x][y].equals(" Y ")) {
            if (player == 1) {
                sign = " X ";
            } else if (player == 2) {
                sign = " O ";
            }
            field[x][y] = sign;

            return "You made a move! " + sign + "on " + x + " " + y;
        } else {
            return

                    "This position is taken! Choose different one";
        }
    }


    public String seekForWinner(String[][] table, int x, int y) {
        int i = 0;
        int j = 0;
        int counter =0;
        String winner = null;



            for ( i = 0; i < x ; i++) {
               while(j<x){
                if(table[j][i].equals(" X ")){
    counter++;
}
j++;
            }}
        return Integer.toString(counter);
//                if (table[j][i].equals(" X ")){
//                    if( i==0){
//                        if(table[j][i + 1].equals(" X ") && table[j][i+2].equals(" X ") ){
//                            winner = "winner!";
//                        }}
//                        if(i==x-1) {
//                            if (table[j][i-2].equals(" X ") && table[j][i-1].equals(" X ")){
//                                winner = "winner2!";
//                            }
//                        }
////                        else{
////                            if (table[j][i-1].equals(" X ") && table[j][i+1].equals(" X ")){
////                                winner = "winner3!";
////                            }
////                        }
//                }



    }
//                        if (i==x){
//                            if(table[j][i-2].equals(" X ") && table[j][i-1].equals(" X ")){
//                                winner ="winner2!";
//                            }
//                        }
//                        else{
//                            if(table[j][i-1].equals(" X ") && table[j][i+1].equals(" X ")){
//                                winner ="winner3";
//                            }
                        }

//                if (table[j][i].equals(" X ")){
//                    if (i == 0){
//                        if(table[j][i+1].equals(" X ") || table[j][i+2].equals(" X ")){
//                            counter++;
//                        }}
//                        else if(i==x-1){
//                            if(table[j][i-1].equals(" X ") || table[j][i-2].equals(" X ")){
//                                counter++;
//                        }}
//                        else{
//                            if(table[j][i-1].equals(" X ") || table[j][i+1].equals(" X ") ){
//                                counter++;}
//                        }
//                    }




//            if (counter == 3) {
//                winner = "We have a winner! X wins!";
//                System.out.println(counter);
//            }






