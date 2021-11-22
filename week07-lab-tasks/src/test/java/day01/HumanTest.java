package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testConstructor() {

        try {
            new Human("John Doe",1780);
        }
        catch (IllegalArgumentException iae){
            assertEquals(iae.getMessage(),"Too old!");
        }

        try {
            new Human("Johndoe",1990);
        }
        catch (IllegalArgumentException iae){
            assertEquals(iae.getMessage(),"Name is too short!");
        }

        assertEquals("John Doe",new Human("John Doe",1990).getName());
    }
}