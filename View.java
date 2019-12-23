/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author im5no
 */
public class View
{
    private final Model _model;
    
    public View(Model gameBoard)
    {
        _model = gameBoard;
    }
    public void printGameBoard()
    {
        for (int y = 0; y < _model.getBoardSize(); y++)
        {
            for (int x = 0; x < _model.getBoardSize(); x++)
            {
                GameNode node = _model.getNode(y, x);
                System.out.print(node.getSymbol());
                if (x < _model.getBoardSize() - 1)
                    System.out.print(" | ");
            }
            
            System.out.println();
            if (y < _model.getBoardSize() - 1)
            {
                System.out.print("-");
                for (int i = 0; i < _model.getBoardSize() - 1; i++)
                    System.out.print(" + -");
            }
            System.out.println();
        }
    }
    
    public CoordinateToMark getNextPlayerInput()
    {
        /* Assume input format is valid. Cuz lazy. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an input. Format is -> \"{X} {Y}\". ");
        String input = scanner.nextLine();
        String[] coordinates = input.split(" ");
        int xCoordinate = Integer.parseInt(coordinates[0]);
        int yCoordinate = Integer.parseInt(coordinates[1]);
        
        return new CoordinateToMark(
            xCoordinate,
            yCoordinate);
    }
    
    public void notifyPlayersOfWhoseTurnItIs(char nextPlayerSymbol)
    {
        System.out.println(nextPlayerSymbol + "'x turn.");
    }
    
    public void printVictoryDialog()
    {
        char victoriousPlayerSymbol = _model.getVictoriousSymbol();
        System.out.println(victoriousPlayerSymbol + "'s won!");
    }
    
    public void clearUI()
    {
        // Clear the output terminal. This isn't supported by Java LOL!
    }
}
