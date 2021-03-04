package rocks.zipcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private Hangman hangman;
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void countDownTest() {
        Boolean expected = true;

            // When
        Boolean actual = Hangman.countDown(5);

            // Then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getWinnerTest() {
        // Given
        String expectedWinner = "X";

        // When
        String actualWinner = board.getWinner();

        // Then
        Assert.assertEquals(expectedWinner, actualWinner);
    }
}
