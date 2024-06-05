package baseball.domain;

import baseball.global.util.RandomNumberGenerator;

import java.util.List;

public class Computer {
    private final List<Integer> numbers;

    public Computer() {
        this.numbers = RandomNumberGenerator.generateRandomNumber();
        /*이후 랜덤으로 숫자 생성하는 클래스 작성*/
    }

}