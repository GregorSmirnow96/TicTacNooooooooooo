/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author im5no
 */
public class TicTacToe
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Controller controller = new Controller();
        Model model = new Model(3);
        View view = new View(model);

        /* GAME LOOP */
        while (!model.gameIsOver())
        {
            view.printGameBoard();
            boolean playerMustSelectedValidCoordinate;
            do
            {
                CoordinateToMark selectedCoordinate = view.getNextPlayerInput();
                char nextPlayerSymbol = getNextCharacterSymbol();
                view.notifyPlayersOfWhoseTurnItIs(nextPlayerSymbol);
                boolean spotWasSuccessfulyMarked = controller.markSpotWithSymbol(
                    nextPlayerSymbol,
                    selectedCoordinate,
                    model);
                playerMustSelectedValidCoordinate = !spotWasSuccessfulyMarked;
            }
            while (playerMustSelectedValidCoordinate);
            view.clearUI();
        }
        
        view.printGameBoard();
        view.printVictoryDialog();
    }
    
    
    
    
    private static final char[] DEFAULT_PLAYER_SYMBOLS = new char[]
    {
        'X',
        'O'
    };
    private static int turnCount = 0;
    private static char getNextCharacterSymbol()
    {
        return DEFAULT_PLAYER_SYMBOLS[
            turnCount++ % DEFAULT_PLAYER_SYMBOLS.length];
    }
}
