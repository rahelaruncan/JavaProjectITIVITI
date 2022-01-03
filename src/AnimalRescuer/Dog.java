package AnimalRescuer;

public abstract class Dog extends Animal {


    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzz");
        if (getHungerLevel() >= 3)
            setHungerLevel(getHungerLevel() - 3);
    }
}
