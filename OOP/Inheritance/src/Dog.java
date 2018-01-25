// use behavior in Animal class
public class Dog extends Animal {

    // not all animals have these characteristics, but dogs do
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // inherits constructor from the Animal class we are extending
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // overriding a method in the super class from the Animal class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // calls the Animal.eat class from the animal class
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // don't look in current class for the move method, automatically go to class we are extending from
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        // if it can't find it in Dog class, it will search Animal class for the move method
        // this is what happens without the super class, otherwise it will just use the move method in the Animal class
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
