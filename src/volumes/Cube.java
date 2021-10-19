package volumes;

/**@author steph*/

public class Cube {
    private double side;
    private double volume;

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
