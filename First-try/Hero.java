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
    private int gravity;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Moving();
        move(-1);

        gravity--;
        setLocation(getX(), getY());
    }    

    /**
     * allows the player to move the character
     */
    public void Moving()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            gravity = 5;
            setLocation(getX(), getY() - gravity);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            gravity = 5;
            setLocation(getX(), getY() + gravity);
        }
    }
}