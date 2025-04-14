import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        int height = getHeight();
        int width = getWidth();
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Balloon ball = new Balloon();
        addObject(ball, 0, height/2);
    }
}
