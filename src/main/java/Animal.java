
public class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("sound . . .");
    }
    void eat(){
        System.out.println(this.name + " eats");
    }
}
