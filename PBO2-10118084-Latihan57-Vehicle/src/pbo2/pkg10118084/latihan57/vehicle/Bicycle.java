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
public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle(int myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }

   

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
