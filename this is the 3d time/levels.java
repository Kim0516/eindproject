import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levels extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class levels.
     * 
     */
    public levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 720, 1, false); 
        if(Greenfoot.mouseClicked(Enemy1.class))
        {

        }
        showText(""+score,700,10);
    }
}
