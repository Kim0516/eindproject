import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    int health =1;
    public Enemy2()
    {
        super(2);
        setRotation(0);
    }

    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy();
        checkHealth();
        attacked();
    }  

    public void checkHealth()
    {
        if (health <= 0)
        {
            getWorld().removeObject(this);
        }
    } 
    
     public void loseHealth()
    {
     health--;   
    }
    
    public void attacked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            loseHealth();
        }
    }
}

