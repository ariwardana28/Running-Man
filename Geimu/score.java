import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
   public score(){
       GreenfootImage newImage=new GreenfootImage(100,50);
       setImage(newImage);
    }
    
   public void setScore(int score){
       GreenfootImage newImage=getImage();
       newImage.clear();
       
       Font fo = new Font( "bold", 27);
       newImage.setFont(fo);
       
       newImage.drawString(""+ score,30,30);
       setImage(newImage);
    }
}
