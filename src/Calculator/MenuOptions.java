package Calculator;

public class MenuOptions {


    ReadFromKeyboard read = new ReadFromKeyboard();
    Calculator calc = new Calculator();
    LogicalOperations logOp = new LogicalOperations();

    protected void doSum() {
        System.out.println("Enter the values you want to add: ");
        System.out.println("The sum is: " +
                calc.sum(read.getInt(), read.getInt()));
    }

    protected void doSubstract() {
        System.out.println("Enter the values you want to substract: ");
        System.out.println("The substraction is: " +
                calc.substract(read.getInt(), read.getInt()));
    }

    protected void doGetTemperatureCelsius() {
        System.out.println("Enter the value for F degrees: ");
        System.out.println("The degrees in C are: " +
                calc.getTemperatureCelsius(read.getInt()));
    }

    protected void doCheckNumberIntervalBetweenTwoAndEight() {
        System.out.println("Enter the value to check that the number is between 2 and 8: ");
        System.out.println("The number is: " +
                logOp.checkNumberInterval(read.getInt()));
    }

    protected void doToFastTrackOrNotToFastTrack() {
        System.out.println("Enter the value for FastTrack: ");
        System.out.println("The degrees in C are: " +
                logOp.toFastTrackOrNotToFastTrack(read.getString(),read.getInt()));
    }

    protected void doPrintSwitchCase() {
        System.out.println("Enter the value to print switchCase: ");
        System.out.println("The value is: " +
                logOp.printSwitchCase(read.getInt()));
    }

    protected void doisEligibleToVote() {
        System.out.println("Enter your age: ");
        System.out.println("your Age is: " +
                logOp.isEligibleToVote(read.getInt()));
    }

    protected void doSumAndAverage() {
        System.out.println("Enter the values for the interval: ");
        System.out.println("The average of the interval is: " +
                logOp.sumAndAverage(read.getInt(), read.getInt()));
    }

    protected void doGetAverageFromInterval() {
        System.out.println("Enter the values for the interval: ");
        System.out.println("The average of the interval is: " +
                logOp.getAverageFromInterval(read.getInt(), read.getInt()));
    }

    protected void doComputeAverage() {
        System.out.println("The average of the interval for the numebrs divisible by 7 untill 100 is: " +
        logOp.computeAverage());
    }

    protected void doGetAverage() {
        System.out.println("Enter the values of the array: ");
        System.out.println("The average of the array is: " +
                logOp.getAverage(read.getArray()));
    }

    protected void doPopulateArray() {
        System.out.println("Enter the values to create the array: ");
        System.out.println("The array is " +
                logOp.populateArray(read.getInt(), read.getInt()));
    }

    protected void doPrintListFromNumber() {
        System.out.println("Enter the values for the list and integer: ");
        System.out.println("The list is: " +
                logOp.printListFromNumber(read.getList(), read.getInt()));
    }

    protected void doReverseList() {
        System.out.println("Enter the list: ");
        System.out.println("The reversed list is: " +
                logOp.reverseList(read.getList()));
    }
}