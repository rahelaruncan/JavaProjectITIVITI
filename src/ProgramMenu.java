import java.util.ArrayList;
import java.util.List;

public class ProgramMenu {


    public void printMenu() {
        System.out.println("Hello!");
        System.out.println("Choose an option:");
        List<String> menuList = new ArrayList<>();
        menuList.add("Calculator");
        menuList.add("Logical Operations");

        for (int i = 0; i <menuList.size(); i++){
            System.out.println((i+1) +" - "+ menuList.get(i));
        }
        System.out.println("0 - Exit");
    }

    public void printFirstSubMenu() {
        System.out.println("Choose an option:");
        List<String> firstSubMenuList = new ArrayList<>();
        firstSubMenuList.add("Sum");
        firstSubMenuList.add("Substract");
        firstSubMenuList.add("Get Celsius temperature from Fahrenheit");

        for (int j = 0; j <firstSubMenuList.size(); j++){
            System.out.println((j+1) +" - "+ firstSubMenuList.get(j));
        }
        System.out.println("0 - To Go back");
    }

    public void printSecondSubMenu() {
        System.out.println("Choose an option:");
        List<String> secondSubMenuList = new ArrayList<>();
        secondSubMenuList.add("Check if the number is between 2 and 8");
        secondSubMenuList.add("Is FastTrack or not?");
        secondSubMenuList.add("Print switchCase");
        secondSubMenuList.add("Are you eligible for vote?");
        secondSubMenuList.add("Sum and Average");
        secondSubMenuList.add("Sum and Aderage from interval");
        secondSubMenuList.add("Compute average");
        secondSubMenuList.add("Populate array");
        secondSubMenuList.add("Print list from the following number");
        secondSubMenuList.add("Reversed list");

        for (int z = 0; z <secondSubMenuList.size(); z++){
            System.out.println((z+1) +" - "+ secondSubMenuList.get(z));
        }
        System.out.println("0 - To Go back");
    }


}
