public class MyWorld extends World
{
    private GreenfootSound musica = new GreenfootSound("background.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
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
    }
    public void started()
    {
        musica.play();
        musica.playLoop();
    }
        private int puntos = 0;
        private int frames = 0;
    public void act() 
    {
        frames++;
        if (frames % 60== 0) {
            puntos++;
        }

        showText("Puntos: " + puntos ,300, 30);
    }
}
