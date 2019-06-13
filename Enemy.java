import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Enemy extends Actor
{
    
    private int health;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }   
    public void loseHealth()
    {
     health--;   
    }
    public void moveEnemy()
    {
        move(-Greenfoot.getRandomNumber(7));
    }
    public void Health()
    {
     loseHealth();
    }
    public void checkHealth()
    {
        if (health <= 2)
        {
            getWorld().removeObject(this);
    }
}
}

