package ex1;

public class Driver {
    public static void main(String[] args) {
        Test t = new Test();

       t.SetQuestions(new TestQuestion[]{
               new TestQuestion("What is the teachers name","wallace"),
               new TestQuestion("What language are we learning","java"),
               new TestQuestion("Which ide does Wallace recommend the students use?","IntelliJ")
       });

        TestQuestion tq = new TestQuestion("Which organization owns Java?","Oracle");
        t.AddQuestion(tq);

        t.RunTest();
    }
}
