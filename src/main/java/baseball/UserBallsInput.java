package baseball;

import camp.nextstep.edu.missionutils.Console;

public class UserBallsInput {

    private int maxLen;

    public UserBallsInput() {
        this(3);
    }

    public UserBallsInput(int maxLen) {
        this.maxLen = maxLen;
    }

    public int getBallsLength() {
        return maxLen;
    }

    public String inputNumber() {
        String buffer = Console.readLine();
        return buffer;
    }

    public String inputNumberTest(String input) {
        String buffer = input;
        validityChecker(buffer);
        return buffer;
    }

    public void validityChecker(String input) {
        validLength(input);
        validElement(input);

    }

    public void validLength(String input) {
        if (input.length() != maxLen) {
            throw new IllegalArgumentException("input의 길이가 유효하지 않습니다");
        }
    }
    public void validElement(String input) {
        final String REGEX = "[1-9]+";
        if (!input.matches(REGEX)) {
            throw new IllegalArgumentException("input의 구성요소가 0을 제외한 숫자로만 이루어지지 않습니다");
        }
    }
}