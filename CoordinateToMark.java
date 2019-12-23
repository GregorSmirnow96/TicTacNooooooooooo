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
public class CoordinateToMark
{
    private final int _selectedXCoordinate;
    private final int _selectedYCoordinate;

    public CoordinateToMark(
        int selectedXCoordinate,
        int selectedYCoordinate)
    {
        _selectedXCoordinate = selectedXCoordinate;
        _selectedYCoordinate = selectedYCoordinate;
    }
    
    public int getSelectedXCoordinate()
    {
        return _selectedXCoordinate;
    }
    
    public int getSelectedYCoordinate()
    {
        return _selectedYCoordinate;
    }
}
