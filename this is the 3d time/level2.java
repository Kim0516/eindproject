import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends levels
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {
        addObject(new Hero2(),360, 610);
        
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
        
        //adding enimies on the ground
        addObject(new Enemy2(),650,610);
        addObject(new Enemy2(),923,610);
        addObject(new Enemy2(),1400,610);
        addObject(new Enemy2(),6340,610);
        addObject(new Enemy2(),3542,610);
        addObject(new Enemy2(),8764,610);
        addObject(new Enemy2(),3241,610);
        addObject(new Enemy2(),5562,610);
        addObject(new Enemy2(),6857,610);
        addObject(new Enemy2(),1969,610);
        addObject(new Enemy2(),4201,610);
        addObject(new Enemy2(),3502,610);
        addObject(new Enemy2(),2640,610);
        addObject(new Enemy2(),7895,610);
        addObject(new Enemy2(),9106,610);
        addObject(new Enemy2(),5502,610);
        addObject(new Enemy2(),5932,610);
        addObject(new Enemy2(),1362,610);
        
        //adding other enemies
        addObject(new Enemy2(),950,400); //1
        addObject(new Enemy2(),1723,476);//3
        addObject(new Enemy2(),1600,234);//2
        addObject(new Enemy2(),6693,365);//10
        addObject(new Enemy2(),3263,436);//6
        addObject(new Enemy2(),2595,138);//5
        addObject(new Enemy2(),7595,522);//11
        addObject(new Enemy2(),2135,230);//4
        addObject(new Enemy2(),7895,212);//12
        addObject(new Enemy2(),4895,312);//8
        addObject(new Enemy2(),400,262);//7
        addObject(new Enemy2(),5313,402);//9
        addObject(new Enemy2(),8523,439);//12
        addObject(new Enemy2(),9350,269);//13
        addObject(new WorldSwitch2(),4003,610);
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
