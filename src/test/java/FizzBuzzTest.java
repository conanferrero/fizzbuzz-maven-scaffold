import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void return_1_given_1() {
        FizzBuzz item = new FizzBuzz(1);
        assertEquals("1",item.toString());
    }
}
