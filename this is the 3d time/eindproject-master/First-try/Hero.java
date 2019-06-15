import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
import java.util.*;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int gravity =1;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2-90;
        boolean onGround = (getY() == groundLevel);

        if(Greenfoot.isKeyDown("w") && onGround == true || Greenfoot.isKeyDown("Up") && onGround == true)
        {
            gravity = 10;
        }
        if(getY() < 610)
        {
            gravity--;
        }
        if(getY() > 615)
        {
            gravity=1;
        }
        Moving();
        move(-1);
        setLocation(getX(), getY() - gravity);
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
}