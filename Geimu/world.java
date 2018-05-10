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
    
    int loop=0;
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
        int acak=Greenfoot.getRandomNumber(1);
        if(loop==0){
            addObject(new pohon(),600,600-acak);
            loop=-75;
        }else{
            loop++;
        }
    }
    
    public class Counter1 extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void addScore()
    {
        score++;
    }
}

}

