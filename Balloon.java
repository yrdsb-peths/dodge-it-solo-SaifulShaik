import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Actor
{
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        move(-3);
        
        if (getX() <= 0) {
            resetBomb();
        }
        
        if (isTouching(Hero.class)) {
            Gameover end = new Gameover();
            getWorld().addObject(end, 100, 100);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBomb() {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0) {
            setLocation(500, 100);
        } else {
            setLocation(500, 300);
        }
    }
}
