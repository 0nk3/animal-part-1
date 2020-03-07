public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Rax");
        dog.eat();
        dog.sound();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        Animal cat = new Cat("Stormy");
        cat.eat();
        cat.sound();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        Home home = new Home();
        Animal dog1 = new Dog("Bobby");
        Animal dog2 = new Dog("Snoopy");
        Animal cat1 = new Cat("Kitty");
        home.makeAllSounds();    //<--- Does nothing since no pet hs been adopted yet

        home.adoptPet(dog1);
        //home.makeAllSounds();

        home.adoptPet(cat);
        //home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
