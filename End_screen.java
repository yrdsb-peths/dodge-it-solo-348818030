import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End_screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End_screen extends Actor
{
    /**
     * Act - do whatever the End_screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        GreenfootImage image = getImage();
        if(image.getWidth() < 590 || image.getHeight() < 390)
        {
            image.scale(image.getWidth() + 10, image.getHeight() + 5);
            setImage(image);
        }
    }
}
