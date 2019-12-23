/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author im5no
 */
public class Model
{
    private final int _boardSize;
    private final GameNode[][] _board;
    
    public Model(int boardSize)
    {
        _boardSize = boardSize;
        _board = new GameNode[boardSize][boardSize];
        
        for (int y = 0; y < boardSize; y++)
            for (int x = 0; x < boardSize; x++)
                _board[y][x] = new GameNode();
    }
    
    public int getBoardSize()
    {
        return _boardSize;
    }
    
    public GameNode getNode(
        int xIndex,
        int yIndex)
    {
        return _board[yIndex][xIndex];
    }
    
    public boolean gameIsOver()
    {
        for (int y = 0; y < _boardSize; y++)
            if (getRow(y).representsVictory())
                return true;
        for (int x = 0; x < _boardSize; x++)
            if (getColumn(x).representsVictory())
                return true;
        return false;
    }
    
    public char getVictoriousSymbol()
    {
        for (int y = 0; y < _boardSize; y++)
            if (getRow(y).representsVictory())
                return _board[y][0].getSymbol();
        for (int x = 0; x < _boardSize; x++)
            if (getColumn(x).representsVictory())
                return _board[0][x].getSymbol();
        return ' ';
    }
    
    private GameLine getRow(int rowIndex)
    {
        Collection<GameNode> rowNodes = Arrays.asList(_board[rowIndex]);
        return new GameLine(rowNodes);
    }
    
    private GameLine getColumn(int columnIndex)
    {
        GameLine column = new GameLine();
        for (int i = 0; i < _boardSize; i++)
            column.add(_board[i][columnIndex]);
        return column;
    }
}
