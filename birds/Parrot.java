package birds;

public class Parrot extends Bird implements Flyable, Eatable {
    static int count;
    
    public void fly() {
        System.out.println("Parrot is flying!");
    }
    
    @Override
    void incrementCount() {
        count++;
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    void decrementCount() {
        while(count > 0) {
            count--;
            break;
        }
    }
    
    public void eat() {
        System.out.println("Parrot is eating");
    }
    
    @Override
    int getCount() {
        return count;
    }
}
