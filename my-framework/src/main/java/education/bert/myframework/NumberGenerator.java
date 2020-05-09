package education.bert.myframework;

public class NumberGenerator {

    private NumberGenerator() {
    }

    public static String generate(int size) {
        if (size < 1 || size > 10) {
            throw new IllegalArgumentException("Size should be between 1 and 10");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append((int) (10 * Math.random()));
        }
        return result.toString();
    }
}
