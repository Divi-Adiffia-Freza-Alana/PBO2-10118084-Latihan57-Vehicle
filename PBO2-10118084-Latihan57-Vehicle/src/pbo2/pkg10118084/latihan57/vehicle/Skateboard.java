/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan57.vehicle;

/**
 *
 * @author Freza
 */
public class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard(double myBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myBoardLength = myBoardLength;
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
}
