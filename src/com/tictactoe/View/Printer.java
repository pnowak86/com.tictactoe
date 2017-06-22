package com.tictactoe.View;

import com.tictactoe.Model.Game;

/**
 * Created by RENT on 2017-06-22.
 */
public class Printer {


    public void printer(){
        Game game = new Game();
        String[][] temp = game.getField();

        //game.getField();
        //int i;
        int j = 0;
        for (int k = 0; k <  temp.length ; k++) {
            System.out.print(" " + temp[j][k] +" ");
            if(k <temp.length-1){
                System.out.print(" | ");
            }
        }
        System.out.println();
        for (int k = 0; k < temp.length -1 ; k++) {

            System.out.print( "  -  " + "  +  ");

            if(k==temp.length-2){
                System.out.print(" - ");
                System.out.println();
            }
        }
        j++;


        for (int k = 0; k < temp.length ; k++) {
            System.out.print(" " + temp[j][k] +" ");
            if(k <temp.length-1){
                System.out.print(" | ");
            }
        }
        System.out.println();
        for (int k = 0; k < temp.length -1 ; k++) {

            System.out.print( "  -  " + "  +  ");

            if(k==temp.length-2){
                System.out.print(" - ");
                System.out.println();
            }
        }
        j++;

        for (int k = 0; k < temp.length ; k++) {
            System.out.print(" " + temp[j][k] +" ");
            if(k <temp.length-1){
                System.out.print(" | ");
            }
        }






    }
}
