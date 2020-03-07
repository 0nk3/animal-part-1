
public class Dog extends Animal{
    private String name;

    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println( "Dog  Barks");
    }
}
