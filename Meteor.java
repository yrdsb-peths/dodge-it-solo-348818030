import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor extends Actor
{
    /**
     * Act - do whatever the Meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(270);
        move(-5);
        
        if(getY() >= 390)
        {
            resetMeteor();
        }
        
        if(isTouching(Student.class))
        {
            
            End_screen screenEnd = new End_screen();
            getWorld().addObject(screenEnd, 300, 200);
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            
            getWorld().removeObject(this);
        }
    }
    
    public void resetMeteor()
    {
        setLocation(300, 20);
    }
}
