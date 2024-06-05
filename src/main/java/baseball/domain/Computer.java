package baseball.domain;

import baseball.global.util.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> numbers;

    public Computer() {
        this.numbers = new ArrayList<>();
        /*이후 랜덤으로 숫자 생성하는 클래스 작성*/
    }
    public void generate() {
        numbers = RandomNumberGenerator.generateRandomNumber();
    }

    public HintResult generateHintResult(List<Integer> givenNumbers) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == givenNumbers.get(i)) {
                strike++;
            }
            ball += isBallIndex(i, givenNumbers);
        }
        return new HintResult(strike, ball);
    }

    private int isBallIndex(int i, List<Integer> givenNumbers) {
        for (int j = 0; j < givenNumbers.size(); j++) {
            if (i != j && numbers.get(i) == givenNumbers.get(j)) {
                return 1;
            }
        }
        return 0;
    }
}

