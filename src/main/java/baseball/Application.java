package baseball;

import baseball.domain.Referee;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        final Referee referee = new Referee();
        final String result = referee.compare(Arrays.asList(3, 1, 2), Arrays.asList(1, 2, 3));
        System.out.println(result); //3볼

    }
}
