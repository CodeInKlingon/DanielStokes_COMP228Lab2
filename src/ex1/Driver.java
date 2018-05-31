package ex1;

public class Driver {
    public static void main(String[] args) {
        Test t = new Test();

       t.SetQuestions(new TestQuestion[]{
               new TestQuestion("What is the teachers name", new String[]{"wallace", "Patrick", "Scott Welsh", "Nasar"}),
               new TestQuestion("What language are we learning",new String[]{"java","c#","c++","javascript"}),
               new TestQuestion("Which ide does Wallace recommend the students use?",new String[]{"IntelliJ","Visual Studio Code","Visual Studio","Eclipse"})
       });

        TestQuestion tq = new TestQuestion("Which organization owns Java?",new String[]{"Oracle","Microsoft","Apple","Google"});
        t.AddQuestion(tq);

        t.RunTest();
    }
}
