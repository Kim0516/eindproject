import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Enemy extends Actor
{
    public  int score = 0;
    int health =0;
    public Enemy(int hp)
    {
        health = hp;
    }
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
    
    public void attacked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            World myWorld = getWorld();
            levels levels = (levels)myWorld;
            score score = levels.getScore();
            score.addScore();
            loseHealth();
        }
    }
}

