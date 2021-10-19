package volumes;

/**@author steph*/

public class Volumes {

    public static void main(String[] args) {
        Cube myCube = new Cube();
        
        myCube.setSide(5);
        
        System.out.println("The volume of the cube is: " + myCube.getVolume());
    }

}
