package com.tictactoe.View;

import com.tictactoe.Model.Game;

/**
 * Created by RENT on 2017-06-22.
 */
public class Printer {


    public void showTable(String[][] table){
       

        //game.getField();
        //int i;
        int j = 0;
        for (int k = 0; k <  table.length ; k++) {
            System.out.print(" " + table[j][k] +" ");
            if(k <table.length-1){
                System.out.print(" | ");
            }
        }
        System.out.println();
        for (int k = 0; k < table.length -1 ; k++) {

            System.out.print( "  - " + "  + ");

            if(k==table.length-2){
                System.out.print(" - ");
                System.out.println();
            }
        }
        j++;


        for (int k = 0; k < table.length ; k++) {
            System.out.print(" " + table[j][k] +" ");
            if(k <table.length-1){
                System.out.print(" | ");
            }
        }
        System.out.println();
        for (int k = 0; k < table.length -1 ; k++) {

            System.out.print( "  - " + "  + ");

            if(k==table.length-2){
                System.out.print(" - ");
                System.out.println();
            }
        }
        j++;

        for (int k = 0; k < table.length ; k++) {
            System.out.print(" " + table[j][k] +" ");
            if(k <table.length-1){
                System.out.print(" | ");
            }
        }
        System.out.println();
        System.out.println();
    }



}
