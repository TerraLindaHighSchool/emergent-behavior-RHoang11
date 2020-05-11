import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }
    
    public void act()
    {
        if(getObjects(Food.class).size() == 0 && getObjects(Pheromone.class).size() == 0)
        {
            Greenfoot.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,168,169);
        Food food = new Food();
        addObject(food,460,370);
        food.setLocation(347,333);
        food.setLocation(247,257);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,437,507);
        AntHill antHill3 = new AntHill();
        addObject(antHill3,511,113);
        AntHill antHill4 = new AntHill();
        addObject(antHill4,132,428);
        Food food2 = new Food();
        addObject(food2,476,294);
        Food food3 = new Food();
        addObject(food3,344,160);
        Food food4 = new Food();
        addObject(food4,292,401);
        Food food5 = new Food();
        addObject(food5,74,274);
        Food food6 = new Food();
        addObject(food6,529,215);
        Food food7 = new Food();
        addObject(food7,199,68);
        Food food8 = new Food();
        addObject(food8,31,95);
        Food food9 = new Food();
        addObject(food9,516,497);
        Food food10 = new Food();
        addObject(food10,232,584);
        Food food11 = new Food();
        addObject(food11,51,532);
    }
}
    

