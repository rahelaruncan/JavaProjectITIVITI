package AnimalRescuer;

public abstract class Animal {
    private String name;
    private String race;
    private int ageYears;
    private String color;
    private float weight;
    private boolean hasVaccines;
    private Rescuer owner;
    private int happinessLevel;
    private int hungerLevel;

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public Rescuer getOwner() {
        return owner;
    }

    public void setOwner(Rescuer owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHasVaccines(boolean hasVaccines) {
        this.hasVaccines = hasVaccines;
    }

    public boolean isHasVaccines() {
        return hasVaccines;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public abstract void eat();

    public abstract void speak();

    public abstract void sleep();

    public abstract void play();


}
