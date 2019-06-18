import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{
    public Enemy3()
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
        if (getX() == -65)
        {
            getWorld().removeObject(this);
        }
    }  

    public void checkHealth()
    {
        if (health <= 1)
        {
            getWorld().removeObject(this);
        }
    }

    public boolean atWorldEdge()

    {  
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)  
            return true;  
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)  
            return true;  
        else 
            return false;  
    }  
}