import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getAnswerCount(){
        return this.answers.size();
    }


    public void addAnswer(String answer) {
        this.answers.add(answer);
    }


    public String getAnswerAtIndex(int index) {
        return this.answers.get(index);
    }

    public String randomAnswer(){
        Collections.shuffle(this.answers);
        return answers.get(0);
    }

//    public static void shuffle(List<?> answers){
//        EightBall.shuffle(answers);
//    }
//
//    public String shuffleAnswer(){
//
//        answers.add("Definite yes");
//        answers.add("Hell no");
//        answers.add("Probably maybe");
//
//        EightBall.shuffle(answers);
//
//        return "EightBall says:" + answers.getAnswerAtIndex(0);
//
//    }
}
