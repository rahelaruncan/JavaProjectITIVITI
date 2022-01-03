package AnimalRescuer;

public class MainApp {


    public static void main(String[] args) {
        MainApp animalRescuer = new MainApp();
        DogFood dogFood = new DogFood();
        Girl hannah = new Girl();
        Labrador gicu = new Labrador();
        animalRescuer.initGirl(hannah);
        animalRescuer.initDog(gicu);
        animalRescuer.initFood(dogFood);
        hannah.adoptAnimal(gicu, hannah);
        System.out.println(gicu.getOwner().getName());
        System.out.println(hannah.getName() + " il duce pe " + gicu.getName() + " si ii da de mancare");
        hannah.feedAnimal(gicu, dogFood);
        System.out.println(gicu.getName() + " happiness level: " + gicu.getHappinessLevel());
        System.out.println(gicu.getName() + " hunger level: " + gicu.getHungerLevel());

        gicu.sleep();
        hannah.playWithTheAnmal(gicu);
        hannah.feedAnimal(gicu, dogFood);

        //cainele se loveste
        // il duce la veterinar
        //play


//        Dog tom = new Dog("Tom", "labrador", 2, "golden", 13.3f, true);
//        tom.nameDog = "Tom";
//        tom.ageYears = 4;
//        tom.color = "Golden";
//        tom.race = "labrador";
//        tom.hasVaccines = true;
//        tom.weight = 15.2f;
//        Dog tomita = new Dog();
//        animalRescuer.initDog(tomita);
//        Labrador momo = new Labrador();
//        animalRescuer.initDog(momo);
//        System.out.println(momo.getWeight());
//
//        Labrador gigi = new Labrador();
//        gigi.setNameDog("Gigel");
//        System.out.println(gigi.getNameDog());
//        Girl hannah = new Girl();
//        hannah.playWithTheAnmal();
//        System.out.println(tom.nameDog);
//        tom.play();
//        Dog doggy = new Dog() {
//            @Override
//            public void eat() {
//                System.out.println("");
//            }
//        };
    }

    private void initGirl(Girl girl) {
        girl.setName("Hannah");
        girl.setAge(15);
    }

    private void initDog(Labrador dog) {
        dog.setName("Tomita");
        dog.setAgeYears(4);
        dog.setWeight(15.4f);
        dog.setRace("chau-chau");
        dog.setHasVaccines(false);
        dog.setHappinessLevel(0);
        dog.setHungerLevel(0);

    }

    private void initFood(DogFood dogFood) {
        dogFood.setNameFood("pedigree");
        dogFood.setNutritionalValue(5000.9f);
    }
}
