import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{
  public button button=new button();
  public about about=new about();
  public caramain caramain=new caramain();
   public exit exit=new exit();
    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(685, 500, 1); 
        addObject(button,80,480);
        addObject(about,250,480);
        addObject(caramain,420,480);
        addObject(exit,590,480);
    }
}
