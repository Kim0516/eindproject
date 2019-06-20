import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndBoss extends Enemy
{
    int health =2;
    public EndBoss()
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
        move(Greenfoot.getRandomNumber(5));
        checkHealth();
        attacked();
        if(getX() > 720)
        {
            setLocation(getX()-360, getY());
        }
        if(getX() < 5)
        {
            setLocation(getX()+660, getY());
        }
    }  

    public void checkHealth()
    {
        if (health <= 0)
        {
            getWorld().removeObject(this);
            Greenfoot.setWorld(new chestWorld());
        }
    }
    
      public void loseHealth()
    {
     health--;   
    }
}
