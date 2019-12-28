public class FizzBuzz {
    private final int value;

    public FizzBuzz(int i) {
        this.value = i;
    }


    public String toString1() throws IllegalAccessException{
        if (this.value <= 0) {
            throw new IllegalAccessException("Invalid Input");
        }
        String s1 = returnFizz();
        String s2 = returnBuzz();
        String s3 = returnWhizz();
        String result = s1 + s2 + s3;
        if (!result.isEmpty()) return  result;
        return String.valueOf(this.value);
    }

    private boolean isDivBy(int i)
    {
        if (this.value % i == 0)
        {
            return true;
        }
        return  false;
    }

    private String returnFizz()
    {
        if (isDivBy(3)) return "Fizz";
        return "";
    }

    private String returnBuzz()
    {
        if (isDivBy(5)) return "Buzz";
        return "";
    }

    private String returnWhizz()
    {
        if (isDivBy(7)) return "Whizz";
        return "";
    }
}
