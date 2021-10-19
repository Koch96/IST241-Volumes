package volumes;

// Stephen Koch
// Cone
// Oct 19, 2021

public class Cone extends Shape{
    private double radius;
    private double height;
    
    public Cone(double radius, double height){
        
    }
    
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    public double calcVolume(double radius, double height){
        volume = (Math.PI * radius * radius * height);
        return volume;
    }
}
