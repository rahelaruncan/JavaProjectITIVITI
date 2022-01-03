package Calculator;

import java.util.HashMap;

public class Login {
    ProgramLogic logic = new ProgramLogic();
    private final HashMap<String, String> USERS_AND_PASS = new HashMap<>();
    final int MAX_ATTEMPT = 3;

    public void logInOrTryAgain() {
        int remainingAttempts = MAX_ATTEMPT;
        while (remainingAttempts > 0) {
            if (checkCredentials()) {
                logic.runProgram();
                return;
            } else {
                if (remainingAttempts > 1) {
                    System.out.println("Incearca din nou");
                    remainingAttempts--;
                    System.out.println("Mai ai " + remainingAttempts + " incercari");
                } else {
                    remainingAttempts--;
                }
            }
        }
        if (remainingAttempts == 0) {
            System.out.println("Maximum number of attempts exceeded");
        }
    }

    public boolean checkCredentials() {
        initUserList();
        ReadFromKeyboard read = new ReadFromKeyboard();
        System.out.println("Enter user:");
        String x = read.getString();
        System.out.println("Enter password:");
        String y = read.getString();
        return USERS_AND_PASS.get(x) != null && USERS_AND_PASS.get(x).equals(y);
    }

    private void initUserList() {
        USERS_AND_PASS.put("Cosmin", "pass");
        USERS_AND_PASS.put("s", "pass");
        USERS_AND_PASS.put("z", "pass");
        USERS_AND_PASS.put("AnimalRescuer", "pass");
        USERS_AND_PASS.put("q", "pass");
    }
}
