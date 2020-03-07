
public class Cat extends Animal {
    private String name;

    Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Cat Meows");
    }
}
