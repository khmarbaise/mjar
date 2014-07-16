package mjar179;

import static java.util.Locale.ENGLISH;
import static java.util.Locale.FRENCH;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mjar179Test {

    @Test
    public void testGetMessage() {
        assertEquals("Hello world !", new Mjar179().getMessage(ENGLISH));
        assertEquals("Bonjour le monde !", new Mjar179().getMessage(FRENCH));
    }
}
