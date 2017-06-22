package com.tictactoe.Model;

/**
 * Created by RENT on 2017-06-22.
 */
public class Game {



    private String[][] field;

    public String[][] getField() {

        return field;
    }

    public String[][] createField() {
        field = new String[3][3];

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

    public void putSomethingToTable(){
    field[0][0] = "xxxxxx";

    }
}



//public String makeMove(int x, int y, int player){
//           String sign = null;
//
//        if(player == 1){
//            sign = "X";
//        }
//        else if(player ==2){
//            sign = "Y";
//        }


       // if(field[x][y] == null){
           // return field[x][y] = sign;

        //}

    //return false;
//}




