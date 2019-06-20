import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends levels
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {
        GreenfootImage bgi = new GreenfootImage("level3-bg.png");
        //adding the hero and the end boss
        addObject(new EndBoss(),600,610);
        addObject(new StillHero(),50,610);
        //adding the platforms
        addObject(new Platform2(),500,450);
        addObject(new Platform2(),750,250);
        addObject(new Platform2(),1000,50);
        addObject(new Platform2(),1250,450);
        addObject(new Platform2(),1500,420);
        addObject(new Platform2(),1750,230);
        addObject(new Platform2(),2000,103);
        addObject(new Platform2(),2250,380);
        addObject(new Platform2(),2500,450);
        addObject(new Platform2(),2750,230);
        addObject(new Platform2(),3000,73);
        addObject(new Platform2(),3250,340);
        addObject(new Platform2(),3500,450);
        addObject(new Platform2(),3750,250);
        addObject(new Platform2(),4000,50);
        addObject(new Platform2(),4250,450);
        addObject(new Platform2(),4500,420);
        addObject(new Platform2(),4750,230);
        addObject(new Platform2(),5000,103);
        addObject(new Platform2(),5250,380);
        addObject(new Platform2(),5500,450);
        addObject(new Platform2(),5750,230);
        addObject(new Platform2(),6000,73);
        addObject(new Platform2(),6250,340);
        //adding small enemies
        addObject(new Enemy3(),550,400);
        addObject(new Enemy3(),900,230);
        addObject(new Enemy3(),1500,30);
        addObject(new Enemy3(),2300,330);
        addObject(new Enemy3(),2900,430);
        addObject(new Enemy3(),3921,230);

        addObject(new Enemy3(),4550,400);
        addObject(new Enemy3(),4900,230);
        addObject(new Enemy3(),5500,30);
        addObject(new Enemy3(),6300,330);
        addObject(new Enemy3(),6900,430);
        addObject(new Enemy3(),7921,230);

        addObject(new Enemy3(),8550,400);
        addObject(new Enemy3(),8900,230);
        addObject(new Enemy3(),9500,30);
        addObject(new Enemy3(),10300,330);
        addObject(new Enemy3(),10900,430);
        addObject(new Enemy3(),11921,230);

        addObject(new Enemy3(),16550,400);
        addObject(new Enemy3(),16900,230);
        addObject(new Enemy3(),17500,30);
        addObject(new Enemy3(),18300,330);
        addObject(new Enemy3(),18900,430);
        addObject(new Enemy3(),19921,230);

        addObject(new Enemy3(),24550,400);
        addObject(new Enemy3(),24900,230);
        addObject(new Enemy3(),25500,30);
        addObject(new Enemy3(),26300,330);
        addObject(new Enemy3(),26900,430);
        addObject(new Enemy3(),27921,230);
    }
}
