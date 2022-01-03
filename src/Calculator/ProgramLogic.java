package Calculator;

public class ProgramLogic {

    ReadFromKeyboard read = new ReadFromKeyboard();
    ProgramMenu menu = new ProgramMenu();
    MenuOptions options = new MenuOptions();

    public void runProgram() {
        boolean repeat;
        do {
            menu.printMenu();
            repeat = repeatProgram(read.getInt());
        } while (repeat);
    }

    private boolean repeatProgram(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                menu.printFirstSubMenu();
                firstSubMenu(read.getInt());
                return false;
            case 2:
                menu.printSecondSubMenu();
                secondSubMenu(read.getInt());
                return false;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

    private boolean firstSubMenu(int number) {
        switch (number) {
            case 0:
                menu.printMenu();
                repeatProgram(read.getInt());
                return false;
            case 1:
                options.doSum();
                return true;
            case 2:
                options.doSubstract();
                return true;
            case 3:
                options.doGetTemperatureCelsius();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

    private boolean secondSubMenu(int number) {
        switch (number) {
            case 0:
                menu.printMenu();
                repeatProgram(read.getInt());
                return false;
            case 1:
                options.doCheckNumberIntervalBetweenTwoAndEight();
                return true;
            case 2:
                options.doToFastTrackOrNotToFastTrack();
                return true;
            case 3:
                options.doPrintSwitchCase();
                return true;
            case 4:
                options.doisEligibleToVote();
                return true;
            case 5:
                options.doSumAndAverage();
                return true;
            case 6:
                options.doGetAverageFromInterval();
                return true;
            case 7:
                options.doComputeAverage();
                return true;
            case 8:
                options.doGetAverage();
                return true;
            case 9:
                options.doPopulateArray();
                return true;
            case 10:
                options.doPrintListFromNumber();
                return true;
            case 11:
                options.doReverseList();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

}
