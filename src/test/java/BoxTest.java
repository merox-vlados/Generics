import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("string",2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("string",5,6.5f);
        float resultDouble = box1.getValue() + box1.getFloatValue() + box2.getValue() + box2.getFloatValue();

        assertEquals(17,resultDouble, 0.001);

    }

}