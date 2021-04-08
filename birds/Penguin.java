package birds;

public class Penguin extends Bird implements Swimmable, Eatable {
    static int count;
    
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
        System.out.println("Penguin is eating");
    }
    
    @Override
    int getCount() {
        return count;
    }
    
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
