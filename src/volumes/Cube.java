package volumes;

/**@author steph*/

public class Cube {
    private double side;
    private double volume;

    public void setSide(double s) {
        side = s;
    }

    public double calcVolume() {
        volume = Math.pow(side, 3);
        return volume;
    }

}
