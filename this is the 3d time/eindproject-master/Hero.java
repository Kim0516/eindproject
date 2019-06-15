    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.lang.*;
    import java.util.*;
    /**
     * Write a description of class Hero here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Hero extends Actor
    {
        public void Standing()
    {
        setImage("standing.gif");
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Moving();
       Standing();
       move(-1);
    }    
    
    /**
     * allows the player to move the character
     */
    public void Moving()
    {
        if(Greenfoot.isKeyDown("Right"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-2);
        }
    }
}