import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chestWorld extends levels
{
    /**
     * Constructor for objects of class chestWorld.
     * 
     */
    public chestWorld()
    {
        addObject(new StillHero(),50,610);
        addObject(new Chest(),650,610);
    }
}
