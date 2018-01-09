import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestEightBall {

    EightBall eightBall;
    ArrayList<String> answers;

    @Before
    public void before(){
        answers = new ArrayList<>();
        answers.add("Definite yes");
        answers.add("Hell no");
        answers.add("Probably maybe");
        eightBall = new EightBall(answers);
    }

    @Test
    public void hasLength(){
        assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Drink!");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void getAnswerAtIndex(){
        eightBall.addAnswer("Definite yes");
        assertEquals("Definite yes", eightBall.getAnswerAtIndex(0));
    }
}
