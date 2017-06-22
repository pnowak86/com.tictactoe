package com.tictactoe.Controller;

import com.tictactoe.Model.Game;
import com.tictactoe.View.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Game game = new  Game();

        game.createField();
        System.out.println(game.getField()[0][0]);
         printer.printer();
        System.out.println();
        System.out.println();
        System.out.println("-----------------------");
 game.putSomethingToTable();
        System.out.println(game.getField()[0][0]);
        //printer.printer();
//        printer.printer();


    }
}
