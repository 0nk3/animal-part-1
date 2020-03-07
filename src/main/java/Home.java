import java.util.ArrayList;

public class Home {
    ArrayList<Animal> pets = new ArrayList<>();

    public void adoptPet(Animal animal){
        pets.add(animal);
    }
    public void makeAllSounds(){
        for (Animal pet:pets) {
            if(pet instanceof Dog){
                System.out.println("Dog Barks");
            }else {
                System.out.println("Cat Meows");
            }
        }
    }
}
