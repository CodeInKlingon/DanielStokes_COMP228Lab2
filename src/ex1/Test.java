package ex1;

import javax.swing.*;
import java.util.Random;

public class Test {

    private String[] correctResponse = {"Excellent", "Good!", "Kepp it up!", "Nice one"};
    private String[] incorrectResponse = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
    private TestQuestion[] questions = new TestQuestion[]{};

    private Random rn = new Random();

    private int grade = 0;


    public void RunTest(){
        for(int i = 0; i < questions.length; i++){

            //ask question
            String answer = JOptionPane.showInputDialog(null,questions[i].getQuestion());

            //check answer
            if(questions[i].checkAnswer(answer)){
                JOptionPane.showMessageDialog(null, correctResponse[rn.nextInt(correctResponse.length-1)]);
                grade++;
            }else{
                JOptionPane.showMessageDialog(null, incorrectResponse[rn.nextInt(incorrectResponse.length-1)] + "\nThe correct answer is: " + questions[i].getAnswer());
            }
        }

        double percent = ((double)grade / (double)questions.length) * 100;

        JOptionPane.showMessageDialog(null, "Your grade is: " + grade +"/" + questions.length + "or " + percent + "%" );
    }

    public void SetQuestions(TestQuestion[] testQuestions){
        questions = testQuestions;
    }

    public void AddQuestion(TestQuestion newQuestion){
        int questionCount = questions.length;
        TestQuestion[] oldQuestions = questions;
        questions = new TestQuestion[questionCount + 1];

        for(int i = 0; i < questionCount; i++){
            questions[i] = oldQuestions[i];
        }
        questions[questions.length-1] = newQuestion;
    }

}


class TestQuestion{

    private String question;
    private String answer;

    public TestQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response){
        return answer.toLowerCase().equals(response.toLowerCase());
    }
}
