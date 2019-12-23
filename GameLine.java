/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author im5no
 */
public class GameLine extends ArrayList<GameNode>
{
    public GameLine()
    {
    }
    
    public GameLine(Collection<GameNode> nodesInLine)
    {
        super(nodesInLine);
    }
    
    public boolean representsVictory()
    {
        char firstSymbol = this.get(0).getSymbol();
        if (firstSymbol == ' ')
            return false;
        return this.stream().noneMatch(node ->
            node.getSymbol() != firstSymbol);
    }
}
