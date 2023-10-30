package baseball;

import baseball.domain.Judgement;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

        Judgement judgement = new Judgement();
//        final int count = judgement.correctCount(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3));
//        System.out.println(count);
        final boolean place = judgement.hasPlace(Arrays.asList(7, 8, 9), 1, 8);
        System.out.println(place); //true

    }
}
