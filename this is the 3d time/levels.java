import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levels extends World
{
    private static score score = new score();
    /**
     * Constructor for objects of class levels.
     * 
     */
    public levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 720, 1, false); 
        addObject(score,650,50);
    }

    public score getScore()
    {
        return score;
    }
}
