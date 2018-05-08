import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{
    public char1 char1=new char1();
    public tanah tanah=new tanah();
  
    int counter=0;
    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(tanah,300,600);
        addObject(char1,30,325);
    }
    
    public void act()
    {
        counter++;
        if(counter==100)
        {
            pohon pohon=new pohon();
            
            addObject(pohon, 400, 320);
            
            counter=0;
        }
    }
}

