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
        super(720, 720, 1);
        addObject(new Hero(),360, 610);
        update();
    }
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi = new GreenfootImage("Flat Night 2 BG.png"); 
    int bgiWidth = bgi.getWidth();
    public void act()
    {
        baseX = (baseX + bgiWidth - 1) % bgiWidth;
        update();
    }
     
    private void update()
    {
        if (baseX != 0) getBackground().drawImage(bgi, baseX - bgiWidth, 0);
        if (baseX < getWidth()) getBackground().drawImage(bgi, baseX, 0);
    }
}
