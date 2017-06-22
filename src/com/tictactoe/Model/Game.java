package com.tictactoe.Model;

/**
 * Created by RENT on 2017-06-22.
 */
public class Game {


    private String[][] field;

    public String getSign() {
        return sign;
    }

    private String sign;


    public String[][] getField() {

        return field;
    }

    public String[][] createField() {
        field = new String[3][3];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
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
            return field[x][y];
        } else {
            return
                    "This position is taken! Choose different one";
        }
        }


    public String seekForWinner(int x, int y){
int j =0;
int counter  =0;
        if (field[x][y].equals(" X ") || field[x][y].equals(" Y ")){

            for (int i = 0; i <field.length-1 ; i++) {

                if(field[j][i].equals(" X ")){


                    counter++;
                }



            }

        }
if (counter == 3){
    return Integer.toString(counter);
}
        return Integer.toString(counter);
    }

}




