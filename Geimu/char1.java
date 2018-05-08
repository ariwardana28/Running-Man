import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class char1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class char1 extends Actor
{
    private int vSpeed=7;
    private int speed=5;
    private int acceleration=1;
    private int jumpStrength=17;

    /**
     * Act - do whatever the char1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    
    public void act() 
    {
        {
        checkKeys();
        checkFall();
        }
        
       if (getOneIntersectingObject(pohon.class)!=null){
        Greenfoot.stop ();
        getWorld().addObject (new gameover(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/2);
       }
    }
    
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {

            moveLeft();
        }
        if (Greenfoot.isKeyDown("right"))
        {
 
            moveRight();
        }
        if (Greenfoot.isKeyDown("up"))
        {

            if(ontanah())
            {
                jump();
            }
            else{
                fall();
            }
        }

    }
     
    public void jump()
    {
        speed=-jumpStrength;
        fall();
    }
    
    public void checkFall()
    {
        if(ontanah())
        {
            speed=0;
        }
        else{
             fall();
        }
    }
    
    public boolean ontanah()
    {
        Actor under=getOneObjectAtOffset (0,getImage().getHeight()/2, tanah.class);
        return under!= null;
    }
    
    public void fall()
    {
        setLocation(getX(), getY()+speed);
        speed=speed+acceleration;
    }
    
    public void moveRight()
    {
        setLocation(getX()+vSpeed, getY());
    }
    
    public void moveLeft()
    {
        setLocation(getX()-vSpeed, getY());
    }
}
