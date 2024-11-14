package ExpressionEvaluatorTest;


import org.example.ExpressionEvaluator.Utilities;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class UtilitiesTest {
    @Test
    public void testIsNumeric() {
        // Тест для проверки, является ли строка числом

        assertTrue(Utilities.isNumeric("123"));
        assertTrue(Utilities.isNumeric("12.34"));
        assertFalse(Utilities.isNumeric("abc"));
        assertFalse(Utilities.isNumeric("1a2b3c"));
    }

   
}
