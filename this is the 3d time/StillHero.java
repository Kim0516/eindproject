import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StillHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StillHero extends Hero
{
    private int gravity =1;
    private static int score =0;
    /**
     * Act - do whatever the StillHero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2-90;
        boolean onGround = (getY() == groundLevel);
        if(Greenfoot.isKeyDown("w") && onGround == true || Greenfoot.isKeyDown("Up") && onGround == true || Greenfoot.isKeyDown("Space") && onGround == true)
        {
            gravity = 25;
        }
        if(getY() < 610)
        {
            gravity--;
        }
        if(getY() > 615)
        {
            gravity=1;
        }
        if(getX() > 720)
        {
            setLocation(getX()-1, getY());
        }
        if(getX() < 5)
        {
            setLocation(getX()+3, getY());
        }
        if(isTouching(Enemy.class))
        {
            Greenfoot.setWorld(new level3());
            Greenfoot.stop();
        }
        if(Greenfoot.isKeyDown("k"))
        {
            Greenfoot.setWorld(new level2());
        }
        if(Greenfoot.isKeyDown("F8"))
        {
            Greenfoot.setWorld(new level3());
        }
        if(isTouching(Chest.class))
        {
            Greenfoot.stop();
        }
        Moving();
        setLocation(getX(), getY() - gravity);
        Platforms();
    }    
}
