package birds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BirdSanctuary {
    HashSet<Bird> birdSet = new HashSet<>();
    
    static BirdSanctuary instance;
    
    synchronized public static BirdSanctuary getInstance() {
        if(instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }
    
    public void addBird(Bird bird) {
        birdSet.add(bird);
        bird.incrementCount();
    }
    
    public void removeBird(Bird bird) {
        birdSet.remove(bird);
        bird.decrementCount();
    }
    
    public void printFlyable() {
        for(Bird bird : birdSet) {
            if(bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }
    
    public void printSwimmable() {
        for(Bird bird : birdSet) {
            if(bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
    }
    
    public void printEatable() {
        for(Bird bird : birdSet) {
            if(bird instanceof Eatable) {
                ((Eatable) bird).eat();
            }
        }
    }
}
