import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    public Enemy1()
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
        
        if (atWorldEdge())  
        {  
             getWorld().removeObject(this);  
        }  
        checkHealth();
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
    
    

