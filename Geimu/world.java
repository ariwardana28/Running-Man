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
    int pohon_pertama=-5000;
    int pohoncounter=0;
    int score=0;
    int charcounter=0;
    score score1=null;
    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setPaintOrder(pohon.class, char1.class, gameover.class, tanah.class);
        addObject(tanah,300,600);
        addObject(char1,30,325);
        score1=new score();
        score1.setScore(0);
        addObject(score1,300,100);
        
    }
    
    public void act()
    {
        pohoncounter++;
        //System.out.println(counter);
        if (pohoncounter % 100 ==0){
            pohon pohon1 = new pohon();
            addObject( pohon1, 600,600);
        }
        
        if (score>=10 && pohoncounter % 95 ==0){
            pohon pohon1 = new pohon();
            addObject( pohon1, 600,600);
        }
        
        if (score>=20 && pohoncounter % 80 ==0){
            pohon pohon1 = new pohon();
            addObject( pohon1, 600,600);
        }

        
        if (pohoncounter >= pohon_pertama){
            if (charcounter % 100 == 0){
                score++;
                score1.setScore(score);
            }
            
            charcounter++;
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

