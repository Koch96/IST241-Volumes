package volumes;

/**@author steph*/

public class Volumes {

    public static void main(String[] args) {
        double radius = 0;
        double height = 0;
        Cube myCube = new Cube();
        Cone myCone = new Cone(radius, height);
        
//        myCube.setSide(5);
//        System.out.println("The volume of the cube is: " + myCube.getVolume());
        
        System.out.println(myCone.calcVolume(15, 20));
    }

}
