import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Student ada = new Student();
        addObject(ada, 100, 200);
        
        Meteor m1 = new Meteor();
        addObject(m1, 250, 20);
    }
}
