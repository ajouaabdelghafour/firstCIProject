package abdou.firstCiProject.test.java;

import org.junit.Test;

import abdou.firstCiProject.main.java.HelloAbdou;

import static org.junit.Assert.assertEquals;

public class HelloAbdouTest {

    private static final String HELLO_ABDOU = "Hello Mr. Abdelghafour AJOUA";

    @Test
    public void HelloAbdou() {
        //Arrange
        HelloAbdou helloAbdou = new HelloAbdou();

        //Act
        String actual = helloAbdou.hello();

        //Assert
        assertEquals(HELLO_ABDOU, actual);

    }
}