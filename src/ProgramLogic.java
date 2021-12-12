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
                options.doSum();
                return true;
            case 2:
                options.doSubstract();
                return true;
            case 3:
                options.doGetTemperatureCelsius();
                return true;
            case 4:
                options.doCheckNumberIntervalBetweenTwoAndEight();
                return true;
            case 5:
                options.doToFastTrackOrNotToFastTrack();
                return true;
            case 6:
                options.doPrintSwitchCase();
                return true;
            case 7:
                options.doisEligibleToVote();
                return true;
            case 8:
                options.doSumAndAverage();
                return true;
            case 9:
                options.doGetAverageFromInterval();
                return true;
            case 10:
                options.doComputeAverage();
                return true;
            case 11:
                options.doGetAverage();
                return true;
            case 12:
                options.doPopulateArray();
                return true;
            case 13:
                options.doPrintListFromNumber();
                return true;
            case 14:
                options.doReverseList();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;

        }
    }

}
