import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    private static int score = 0;
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+score, 24, Color.BLACK, Color.WHITE));
    }  
    public void addScore()
    {
        score = score + 100;
    }
    public void bigAdd()
    {
        score = score + 500;
    }
    }    

