import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEightBall {

    EightBall eightBall;

    @Before
    public void before(){
        eightBall = new EightBall();
    }

    @Test
    public void hasLength(){
        assertEquals(0, eightBall.getAnswerCount());
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Definite yes");
        assertEquals(1, eightBall.getAnswerCount());
    }

    @Test
    public void getAnswerAtIndex(){
        eightBall.addAnswer("Definite yes");
        assertEquals("Definite yes", eightBall.getAnswerAtIndex(0));
    }
}
