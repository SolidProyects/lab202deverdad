

import org.example.KeyWords;
import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class test1 {
    @Test
    @DisplayName("Test Odd Numbers")
    void OddNumbersTest() {
        int[] result = {1, 3, 5, 7, 9};
        assertArrayEquals(result, Main.oddList(9));
    }

    @Test
    @DisplayName("Return true if is JavaKeywords")
    void true_if_is_JavaKeyword() {
        assertFalse(KeyWords.keywordInString("Hola soy sole"));
        assertTrue(KeyWords.keywordInString("perdon, soy super sole"));


    }
}
