import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class caramain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caramain extends Actor
{
    /**
     * Act - do whatever the caramain wants to do. This method is called whenever
     * the 'Act' or 'Run' caramain gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new cara());
    }  
}
}
