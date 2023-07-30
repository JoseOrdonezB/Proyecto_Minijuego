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