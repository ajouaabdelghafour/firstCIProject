package abdou.firstCiProject.test.java;

import org.junit.Test;

import abdou.firstCiProject.main.java.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private static final String HELLO_WORLD = "Hello World";

    @Test
    public void getHelloWorld() {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Act
        String actual = helloWorld.getHelloWorld();

        //Assert
        assertEquals(HELLO_WORLD, actual);

    }
}