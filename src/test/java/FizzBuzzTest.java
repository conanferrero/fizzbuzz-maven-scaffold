import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void return_1_given_1() {
        FizzBuzz item =  new FizzBuzz(1);
        assertEquals("1",item.toString());
    }@Test
    void return_Fizz_given_3() {
        FizzBuzz item =  new FizzBuzz(3);
        assertEquals("Fizz",item.toString());
    }@Test
    void return_Buzz_given_5() {
        FizzBuzz item =  new FizzBuzz(5);
        assertEquals("Buzz",item.toString());
    }
}
