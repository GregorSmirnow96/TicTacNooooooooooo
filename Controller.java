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
public class Controller
{
    public boolean markSpotWithSymbol(
        char symbol,
        CoordinateToMark coordinate,
        Model gameModel)
    {
        GameNode nodeToMark = gameModel.getNode(
            coordinate.getSelectedXCoordinate(),
            coordinate.getSelectedYCoordinate());
        if (!nodeToMark.canSetSymbol())
            return false;
        nodeToMark.setSymbol(symbol);
        return true;
    }
}
