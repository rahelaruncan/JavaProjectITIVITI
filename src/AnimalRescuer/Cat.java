package AnimalRescuer;

public class Cat extends Animal{
    private int leftLives= 9;

    public int getLeftLives() {
        return leftLives;
    }

    public void setLeftLives(int leftLives) {
        this.leftLives = leftLives;
    }

    public void purr(){
        System.out.println("rrrrrrr");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }
}
