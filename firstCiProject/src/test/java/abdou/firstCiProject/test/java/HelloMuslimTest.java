package abdou.firstCiProject.test.java;

import org.junit.Test;

import abdou.firstCiProject.main.java.HelloMuslim;

import static org.junit.Assert.assertEquals;

public class HelloMuslimTest {

    private static final String HELLO_MUSLIM = "Assalamou alaikom warahmatou Allah";

    @Test
    public void HelloMuslim() {
        //Arrange
        HelloMuslim helloMuslim = new HelloMuslim();

        //Act
        String actual = helloMuslim.salem();

        //Assert
        assertEquals(HELLO_MUSLIM, actual);

    }
}