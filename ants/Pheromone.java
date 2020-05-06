import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pheromones are chemical produced by animals to communicate to other
 * animals mostly through smell.  Ants produce a unique pheromone to 
 * mark a trail that other ants from the same hill can use to find food.
 * 
 * @author Ryan Hoang 
 * @version 1.0
 */
public class Pheromone extends Actor
{
    private GreenfootImage image;
    private final static int MAX_INTENSITY = 180;
    private int intensity;
   
    
    public Pheromone()
    {
        intensity = 180;
    }
    /**
     * Act - do whatever the Pheromone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        intensity--;
        if(intensity <= 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
             if ((intensity % 6) == 0)  // prevents updating too often
             { 
                 updateImage();
             }
        }
    }    
    
    public void updateImage()
    {
        int size = intensity / 3 + 5;
        image = new GreenfootImage(size +1, size + 1);
        Color color = new Color(intensity/3, intensity/3,intensity/3);
        
        image.setColorAt(10, 10, color);
        image.fillOval(10,10, size, size);
    }
}
