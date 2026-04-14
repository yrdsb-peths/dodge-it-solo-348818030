import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Student ada = new Student();
        addObject(ada, 100, 200);
    }
}
