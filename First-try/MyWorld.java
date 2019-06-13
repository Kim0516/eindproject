import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timer = 3000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with a cell size of 1x1 pixels.
        super(720, 720, 1, false);
        addObject(new Hero(),360, 610);
        addObject(new Platform(),500,550);
        addObject(new Platform(),720,500);
        addObject(new Platform(),950,260);
        addObject(new Platform(),1200,400);
        addObject(new Platform(),1400,234);
        addObject(new Platform(),1300,550);
        addObject(new Platform(),1540,470);
        addObject(new Platform(),2134,552);
        addObject(new Platform(),2268,316);
        addObject(new Platform(),2503,316);
        addObject(new Platform(),2903,556);
        addObject(new Platform(),3103,373);
        update();
    }
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi = new GreenfootImage("Flat Night 2 BG.png"); 
    int bgiWidth = bgi.getWidth();

    public int WorldWidth = 0;
    public void act()
    {
        baseX = (baseX + bgiWidth - 1) % bgiWidth;
        update();

        timer--;
        if(timer > 1000)
        {
            showText(""+timer, 720, 10);
        } else
        {
            showText("",720,10);
        }
        if(timer < 1000)
        {
            showText(""+timer, 725, 10);
        }
        if(timer < 100)
        {
            showText("1", 725, 10);
        }
        if (timer <= 0) {
            Greenfoot.stop();
        }
        if(WorldWidth == 200)
        {
        }
    }

    private void update()
    {
        if (baseX != 0) getBackground().drawImage(bgi, baseX - bgiWidth, 0);
        if (baseX < getWidth()) getBackground().drawImage(bgi, baseX, 0);
    }
}
