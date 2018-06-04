package ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {


    //array of responses to correct answer choices
    private String[] correctResponse = {"Excellent", "Good!", "Kepp it up!", "Nice one"};

    //array of responses for incorrect answer choices
    private String[] incorrectResponse = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying."};

    //array of questions for test object
    private TestQuestion[] questions = new TestQuestion[]{};

    private Random rn = new Random();

    private int grade = 0;


    public void RunTest(){
        for(int i = 0; i < questions.length; i++){

            //ask question
            String[] values = {"0", "3", "6", "12", "18", "24"};

            Object selected = JOptionPane.showInputDialog(null, questions[i].getQuestion(), "Selection", JOptionPane.DEFAULT_OPTION, null, shuffleOptions(questions[i].getOptions()), "0");
            //null if the user cancels.
                String selectedString = selected.toString();
                //do something

            //check answer
            if(questions[i].checkAnswer(selectedString)){
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

    //add new question to array
    public void AddQuestion(TestQuestion newQuestion){
        int questionCount = questions.length;
        TestQuestion[] oldQuestions = questions;
        questions = new TestQuestion[questionCount + 1];

        for(int i = 0; i < questionCount; i++){
            questions[i] = oldQuestions[i];
        }
        questions[questions.length-1] = newQuestion;
    }

    //static method to shuffle all the questions and return them in a random order
    static String[] shuffleOptions(String[] options){
        List<String> shuffledOptions = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            shuffledOptions.add(options[i]);
        }
        Collections.shuffle(shuffledOptions);
        return shuffledOptions.toArray(new String[0]);
    }

}

//question object
class TestQuestion{

    private String question;

    public String[] getOptions() {
        return options;
    }

    private String[] options;
    private String answer;

    public TestQuestion(String question, String[] answers){
        this.question = question;
        this.options = answers;
        this.answer = answers[0];
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

    //bool to check if string is answer
    public boolean checkAnswer(String response){
        return answer.toLowerCase().equals(response.toLowerCase());
    }
}
