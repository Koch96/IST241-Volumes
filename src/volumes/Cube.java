package volumes;

/**@author steph*/

public class Cube extends Shape{
    private double side;

    public void setSide(double newSide) {
        side = newSide;
    }

    public double computeVolume() {
        volume = Math.pow(side, 3);
        return volume;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getSide(){
        return side;
    }

}
