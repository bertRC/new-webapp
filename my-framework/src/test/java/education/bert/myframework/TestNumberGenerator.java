package education.bert.myframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberGenerator {

    @Test
    public void testGenerate() {
        final String result = NumberGenerator.generate(3);
        assertEquals(3, result.length());
    }
}
