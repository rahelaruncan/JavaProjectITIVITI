package AnimalRescuer;

public class Rescuer {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void adoptAnimal(Animal animal, Rescuer owner) {
        animal.setOwner(owner);
        animal.setHappinessLevel(5);
    }

    public void feedAnimal(Animal animal, Food food) {
        if (animal.getHungerLevel() > 1) {
            System.out.println(animal.getName()+" is eating "+ food.getNameFood());
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            animal.setWeight(animal.getWeight() + food.getNutritionalValue());
            animal.setHungerLevel(animal.getHungerLevel() - 2);
        } else {
            System.out.println(animal.getName() + " is full");
        }
    }

    public void playWithTheAnmal(Animal animal) {
        System.out.println("she plays with the animal");
        animal.setHappinessLevel(animal.getHappinessLevel()+3);
        animal.setHungerLevel(animal.getHungerLevel()+3);
    }

    
//
//    String nameRescuer;
//    double money;
//    int age;
//    String gender;
//
//    public void feedAnimal(Animal animal, Food food) {
//        System.out.println(nameRescuer + "just gave some " + food + " food to " + animal);
//        animal.hungry--;
//    }
}
