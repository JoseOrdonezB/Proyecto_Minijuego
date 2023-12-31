import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        destroy();
    }
    
    public void movement()
    {
        move(2);
        setRotation(90);
    }
    
    public void destroy()
    {
        Actor rocket = getOneIntersectingObject(Rocket.class);
        World w = getWorld();
        if (rocket != null)
        {
            w.removeObject(rocket);
            w.removeObject(this);
            Greenfoot.playSound("nave.wav");
        }
        
    }
}
