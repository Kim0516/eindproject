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
            
        }
        Moving();
        setLocation(getX(), getY() - gravity);
        Platforms();
    }    

    /**
     * allows the player to move the character
     */
    public void Moving()
    {
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("Right"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("Left"))
        {
            move(-2);
        }
    }

    /**
     * Allows player to jump on the platforms
     */
    public void Platforms()
    {
        if(isTouching(Platform.class) && getY() < 465)
        {
            gravity--;
        }
        if(isTouching(Platform.class) && getY() > 470)
        {
            gravity = 1;
        }
        if(isTouching(Platform.class) && getY() > 650)
        {
            gravity--;
        }
        if(isTouching(Platform.class) && getY() < 655)
        {
            gravity = 1;
        }
        if(Greenfoot.isKeyDown("w") && isTouching(Platform.class) || Greenfoot.isKeyDown("Up") && isTouching(Platform.class) || Greenfoot.isKeyDown("Space") && isTouching(Platform.class))
        {
            gravity = 25;
        }
        if(isTouching(Platform1.class) && getY() < 465)
        {
            gravity--;
        }
        if(isTouching(Platform1.class) && getY() > 470)
        {
            gravity = 1;
        }
        if(isTouching(Platform1.class) && getY() > 650)
        {
            gravity--;
        }
        if(isTouching(Platform1.class) && getY() < 655)
        {
            gravity = 1;
        }
        if(Greenfoot.isKeyDown("w") && isTouching(Platform1.class) || Greenfoot.isKeyDown("Up") && isTouching(Platform1.class) || Greenfoot.isKeyDown("Space") && isTouching(Platform1.class))
        {
            gravity = 25;
        }
        if(isTouching(Platform2.class) && getY() < 465)
        {
            gravity--;
        }
        if(isTouching(Platform2.class) && getY() > 470)
        {
            gravity = 1;
        }
        if(isTouching(Platform2.class) && getY() > 650)
        {
            gravity--;
        }
        if(isTouching(Platform2.class) && getY() < 655)
        {
            gravity = 1;
        }
        if(Greenfoot.isKeyDown("w") && isTouching(Platform2.class) || Greenfoot.isKeyDown("Up") && isTouching(Platform2.class) || Greenfoot.isKeyDown("Space") && isTouching(Platform2.class))
        {
            gravity = 25;
        }
        if(isTouching(Platform2.class))
        {
            move(-1);
        }
    }
}
