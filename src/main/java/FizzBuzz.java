public class FizzBuzz {
    private final int value;

    public FizzBuzz(int i) {
        this.value = i;
    }

    @Override
    public String toString() {
        if (this.value % 3 == 0) return "Fizz";
        return String.valueOf(this.value);
    }
}
