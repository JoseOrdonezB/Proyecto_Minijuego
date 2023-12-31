import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Rocket rocket = new Rocket();
        addObject(rocket,195,705);
        Spawner spawner = new Spawner();
        addObject(spawner,395,739);
        Rock rock = new Rock();
        addObject(rock,43,53);
        Rock rock2 = new Rock();
        addObject(rock2,240,128);
        Rock rock3 = new Rock();
        addObject(rock3,111,172);
        Rock rock4 = new Rock();
        addObject(rock4,181,40);
        Rock rock5 = new Rock();
        addObject(rock5,345,215);
        Rock rock6 = new Rock();
        addObject(rock6,215,208);
        Rock rock7 = new Rock();
        addObject(rock7,322,54);
        Rock rock8 = new Rock();
        addObject(rock8,22,182);
        rocket.setLocation(198,665);
        spawner.setLocation(397,749);
    }
}
