import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 720, 1, false);
        addObject(new Hero(),360, 610);
        //adding platforms
        addObject(new Platform1(),563,423);
        addObject(new Platform1(),838,500);
        addObject(new Platform1(),950,283);
        addObject(new Platform1(),1095,100);
        addObject(new Platform1(),1347,234);
        addObject(new Platform1(),1732,234);
        addObject(new Platform1(),1540,470);
        addObject(new Platform1(),1974,352);
        addObject(new Platform1(),2343,379);
        addObject(new Platform1(),2621,416);
        addObject(new Platform1(),2903,512);
        addObject(new Platform1(),3103,373);
        //adding enimies
        addObject(new Enemy1(),650,610);
        addObject(new Enemy1(),923,610);
        addObject(new Enemy1(),950,260);
        addObject(new Enemy1(),1200,400);
        addObject(new Enemy1(),1350,610);
        addObject(new Enemy1(),1400,610);
        addObject(new Enemy1(),6340,610);
        addObject(new Enemy1(),4542,610);
        addObject(new Enemy1(),3764,610);
        addObject(new Enemy1(),3241,610);
        addObject(new Enemy1(),5562,610);
        addObject(new Enemy1(),5857,610);
        addObject(new Enemy1(),1600,234);
        addObject(new Enemy1(),6693,365);
        addObject(new Enemy1(),2863,436);
        addObject(new Enemy1(),2595,578);
        addObject(new Enemy1(),7595,232);
        addObject(new Enemy1(),3201,610);
        addObject(new Enemy1(),2135,430);
        addObject(new Enemy1(),3502,610);
        addObject(new Enemy1(),2640,610);
        addObject(new Enemy1(),7895,212);
        addObject(new Enemy1(),7895,610);
        addObject(new Enemy1(),4895,412);
        addObject(new Enemy1(),3995,326);
        addObject(new Enemy1(),5313,402);
        addObject(new Enemy1(),8523,439);
        addObject(new Enemy1(),9106,610);
        addObject(new Enemy1(),9350,269);
        update();
    }
    //add all the code below to level2 to add the background to level 2
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi = new GreenfootImage("bg-level2.png"); 
    int bgiWidth = bgi.getWidth();

    public int WorldWidth = 0;
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
