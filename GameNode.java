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
public class GameNode
{
    private static final char DEFAULT_SYMBOL = ' ';
    
    private char _symbol = DEFAULT_SYMBOL;
    
    public char getSymbol()
    {
        return _symbol;
    }
    
    public boolean setSymbol(char newSymbol)
    {
        boolean symbolWasChanged = false;
        if (canSetSymbol())
        {
            _symbol = newSymbol;
            symbolWasChanged = true;
        }
        return symbolWasChanged;
    }
    
    public boolean canSetSymbol()
    {
        return _symbol == DEFAULT_SYMBOL;
    }
}
