/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class LandTract {

    private double length;
    private double width;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double areaEquals()
    {
        double area = this.length * this.width;
        return area;
    }

    @Override
    public String toString() {
        return "length= " + length + ", width= " + width + ", area= " + this.areaEquals();
    }
    
    public boolean equals(LandTract differentLandTract)
    {
        if (this.areaEquals() == differentLandTract.areaEquals())
        {
            return true;
        }else{
            return false;
        }
                
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
