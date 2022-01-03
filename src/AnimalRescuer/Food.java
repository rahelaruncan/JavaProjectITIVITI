package AnimalRescuer;

import java.time.LocalDateTime;

public abstract class Food {
    private String nameFood;
    private float nutritionalValue;
    private double price;
    private int quantity;
    private LocalDateTime expiryDate;
    private boolean inStock;

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public float getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(float nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
}
