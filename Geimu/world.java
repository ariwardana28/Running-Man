import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{
    public class world extends World
 {
    public char1 char1=new char1();
     public tanah tanah=new tanah();
    int pohon_pertama=200;
    int pohon_pertama=180;
     int pohoncounter=0;
     int score=0;
     int charcounter=0;
    }
public void act()
         {
 
         
        if (pohoncounter == pohon_pertama){
        if (pohoncounter >= pohon_pertama){
             if (charcounter % 100 == 0){
                 score++;
                 System.out.println(score);
             }
             charcounter++;

         }
     }
   }