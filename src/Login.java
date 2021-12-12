import java.util.HashMap;

public class Login {
    ProgramLogic logic = new ProgramLogic();
    private final HashMap<String, String> USERS_AND_PASS = new HashMap<>();
    int totalAttempts = 3;

    public void logInOrTryAgain() {
        while (totalAttempts != 0) {
            if (checkCredentials()) {
                logic.runProgram();
            } else {
                System.out.println("Incearca din nou");
                System.out.println("Mai ai" + (totalAttempts-1) + " incercari");
                totalAttempts--;
                checkCredentials();
            }
        }
        if (totalAttempts == 0) {
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
        return USERS_AND_PASS.get(x).equals(y);
    }

    private void initUserList() {
        USERS_AND_PASS.put("Cosmin", "pass");
        USERS_AND_PASS.put("s", "pass");
        USERS_AND_PASS.put("z", "pass");
        USERS_AND_PASS.put("a", "pass");
        USERS_AND_PASS.put("q", "pass");
    }
}
