import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
   /* @Test
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
    }@Test
    void return_FizzBuzz_given_15() {
        FizzBuzz item =  new FizzBuzz(15);
        assertEquals("FizzBuzz",item.toString());
    }*/

    @ParameterizedTest(name = "return {1} given {0}")
    @CsvSource(
            {
                    "1,1",
                    "3,Fizz",
                    "5,Buzz",
                    "15,FizzBuzz",
            }
    )
    void testFizzBuzz(int input, String expected)
    {
        FizzBuzz item =  new FizzBuzz(input);
        assertEquals(expected,item.toString());
    }
}
