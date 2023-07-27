import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        shoot();
    }
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("Right"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            move(-3);
        }
    }
    
    public void shoot()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("Space") && canFire == true)
        {
           w.addObject(new Laser(), getX() , getY()-50); 
           canFire = false;
        }
        else if (!Greenfoot.isKeyDown("Space"))
        {
            canFire = true;
        }
    }
}
