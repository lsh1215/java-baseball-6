package baseball.view;

import baseball.global.exception.BlankInputException;
import camp.nextstep.edu.missionutils.Console;

public final class ConsoleReader {
    public static String enterMessage() {
        return Validator.validate(Console.readLine());
    }

    private static class Validator {
        public static String validate(String message) {
            validateBlankInput(message);
            return message;
        }

        private static void validateBlankInput(String message) {
            if (message.isBlank()) {
                throw new BlankInputException("Input cannot be blank");
                /*예외처리 메시지 필요*/
            }
        }
    }
}