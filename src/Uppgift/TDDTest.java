package Uppgift;

import org.junit.Assert;
import org.junit.Test;

public class TDDTest {

    @Test
    public void EnglishToMorse() {
        Logic test = new Logic();
        String testInput = "Hej";
        test.translateEnglish(testInput);

        String actual = test.getOutput();
        String expected = ".... . .---";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EnglishToMorseSecond() {
        Logic test = new Logic();
        String testInput = "Yoo hello there.";
        test.translateEnglish(testInput);

        String actual = test.getOutput();
        String expected = "-.-- --- --- / .... . .-.. .-.. --- / - .... . .-. . .-.-.-";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MorseToEnglish() {
        Logic test = new Logic();
        String testInput = ".-- . / .... .- ...- . / .- / -. .. -.-. . / .-- . .- - .... . .-. / - --- -.. .- -.--";
        test.translateMorse(testInput);

        String actual = test.getOutput();
        String expected = "WE HAVE A NICE WEATHER TODAY";

        Assert.assertEquals(expected, actual);
    }

}
