package Calculator;

import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {

    public int checkNumberInterval(int number) {
        if (number >= 2 && number <= 8) {
            System.out.println(number);
        }
        return number;
    }


    public String toFastTrackOrNotToFastTrack(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + text);
        }
        return "";
    }

//     Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//     Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
//     "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul
//     de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la
//     parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
//     Apelati metoda in main() pentru a verifica daca functioneaza.


    public String printSwitchCase(int number) {
        switch (number) {
            case 1:
                return "The number is 1!";
            case 2:
                return "The number is 2!";
            default:
                return "Not in the interval";

        }

    }

    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    //    Write a java program to count backwards from a given number to a lower given number
    public void countBackwards(int start, int finish) {
        if (start < finish) {
            System.out.println("Valoarea de start '" + start + "' ar trebui sa fie mai mare sau egala decat finish '" + finish + "'");
            return;
        }
        for (int i = start; i > finish; i--) {
            System.out.print(i + ", ");
        }
        System.out.print(finish);
    }

//Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and return the average.

    public float sumAndAverage(int a, int b) {
        float sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum / (b - a + 1);
    }

//    Write a Java program by using two for loops to produce the output shown below:
//*******
//******
//*****
//****
//***
//**
//*


    public void printStars(int stars) {
        for (int j = 1; j <= stars; j++) {
            for (int i = stars; i >= j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Modify the program to sum from 111 to 8899, and compute the average.

    public float getAverageFromInterval(int a, int b) {
        int i = a;
        float sum = 0;
        while (i <= b) {
            sum += i;
            i++;
        }
        return sum / (b - a + 1);
    }

//    Write a program to sum those numbers from 1 to 100 that is divisible by 7, and returns the average.

    public float computeAverage() {
        float sum = 0;
        int i = 1;
        int j = 0;
        while (i <= 100) {
            if (i % 7 == 0) {
                sum += i;
                j++;
            }
            i++;
        }
        return sum / j;
    }

//    Write the program do display the first 20 Fibonacci numbers


//    Write a Java program to calculate the average value of array elements.

    public float getAverage(int[] arr) {
        float sum = 0;
        for (int i : arr)
            sum += i;

        return sum / arr.length;
    }

    public int[] populateArray(int start, int end) {
        int k = 0;
        int[] arr = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            arr[k] = i;
            k++;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int i : arr)
            System.out.println(i);

    }

//    Write a Java program to test if an array contains a specific string value.


//    Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
//    iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile
//    din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public List<Integer> printListFromNumber(List<Integer> list, int number) {
        boolean print = false;
        for (Integer i : list) {
            if (i == number) {
                print = true;
            }
            if (print) {
                System.out.println(i);
            }
        }
        return list;
    }

//    Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
//    toate valorile din lista, dar invers(de la capat la inceput).


    public List<Integer> reverseList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int x : list) {
            newList.add(0, x);
        }
        list.clear();
        list.addAll(newList);
        return  newList;
    }


}
