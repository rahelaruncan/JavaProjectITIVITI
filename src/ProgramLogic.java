public class ProgramLogic {

    ReadFromKeyboard read = new ReadFromKeyboard();
    ProgramMenu menu = new ProgramMenu();
    MenuOptions options = new MenuOptions();

    public void runProgram() {
        boolean repeat;
        boolean firstRepeat;
        boolean secondRepeat;
        do {
            menu.printMenu();
            repeat = repeatProgram(read.getInt());
        } while (repeat);

        do {
            menu.printFirstSubMenu();
            firstRepeat = firstSubMenu(read.getInt());
        } while (firstRepeat);

        do {
            menu.printSecondSubMenu();
            secondRepeat = secondSubMenu(read.getInt());
        } while (secondRepeat);
    }

    private boolean repeatProgram(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                firstSubMenu(read.getInt());
                return false;
            case 2:
                secondSubMenu(read.getInt());
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

    private boolean firstSubMenu(int number) {
        switch (number) {
            case 0:
                menu.printMenu();
                return false;
            case 1:
                menu.printFirstSubMenu();
                options.doSum();
                return true;
            case 2:
                menu.printFirstSubMenu();
                options.doSubstract();
                return true;
            case 3:
                menu.printFirstSubMenu();
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
                return false;
            case 1:
                menu.printSecondSubMenu();
                options.doCheckNumberIntervalBetweenTwoAndEight();
                return true;
            case 2:
                menu.printSecondSubMenu();
                options.doToFastTrackOrNotToFastTrack();
                return true;
            case 3:
                menu.printSecondSubMenu();
                options.doPrintSwitchCase();
                return true;
            case 4:
                menu.printSecondSubMenu();
                options.doisEligibleToVote();
                return true;
            case 5:
                menu.printSecondSubMenu();
                options.doSumAndAverage();
                return true;
            case 6:
                menu.printSecondSubMenu();
                options.doGetAverageFromInterval();
                return true;
            case 7:
                menu.printSecondSubMenu();
                options.doComputeAverage();
                return true;
            case 8:
                menu.printSecondSubMenu();
                options.doGetAverage();
                return true;
            case 9:
                menu.printSecondSubMenu();
                options.doPopulateArray();
                return true;
            case 10:
                menu.printSecondSubMenu();
                options.doPrintListFromNumber();
                return true;
            case 11:
                menu.printSecondSubMenu();
                options.doReverseList();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

}
