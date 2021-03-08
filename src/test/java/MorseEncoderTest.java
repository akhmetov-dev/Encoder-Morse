import org.junit.Test;

import static org.junit.Assert.*;

public class MorseEncoderTest {

    @Test
    public void encode() {
//        Кодировка символа
        assertEquals("....", new MorseEncoder().encode("h"));
//        Кодировка слова
        assertEquals(".... . .-.. .-.. ---", new MorseEncoder().encode("hello"));
//        Кодировка фразы
        assertEquals(".... . .-.. .-.. ---   .-- --- .-. .-.. -..", new MorseEncoder().encode("hello world"));


    }
}