import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Question q1 = new Question("What is 9 + 10?", "19");

        Candidate c1 = new Candidate("Alice", 1);
        Candidate c2 = new Candidate("Bob", 2);
        Candidate c3 = new Candidate("Alice Copy", 1);

        Exam exam1 = new Exam("Java Basics", 60);
        Exam exam2 = new Exam("Math Test", 30);

        System.out.println("Question: " + q1.getText());
        System.out.println("Correct answer: " + q1.getCorrectAnswer());

        System.out.println("\nCandidates:");
        System.out.println("c1: name = " + c1.getName() + ", id = " + c1.getId());
        System.out.println("c2: name = " + c2.getName() + ", id = " + c2.getId());
        System.out.println("c3: name = " + c3.getName() + ", id = " + c3.getId());

        System.out.println("\nExams:");
        System.out.println("exam1: title = " + exam1.getTitle() + ", duration = " + exam1.getDuration());
        System.out.println("exam2: title = " + exam2.getTitle() + ", duration = " + exam2.getDuration());

        String userAnswer = "4";
        System.out.println("\nUser answer = " + userAnswer);
        System.out.println("Is correct? " + q1.checkAnswer(userAnswer));

        System.out.println("\nCompare candidates by id:");
        System.out.println("c1 and c2 same id? " + c1.hasSameId(c2));
        System.out.println("c1 and c3 same id? " + c1.hasSameId(c3));

        System.out.println("\nCompare exams by duration:");
        System.out.println("Is exam1 longer than exam2? " + exam1.isLongerThan(exam2));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questionPool = new ArrayList<>();
        questionPool.add(q1);
        questionPool.add(new Question("Java is OOP?", "yes"));
        questionPool.add(new Question("2 + 2?", "4"));

        System.out.print("\nEnter word to search question: ");
        String word = scanner.nextLine();

        for (Question q : questionPool) {
            if (q.getText().contains(word)) {
                System.out.println("Found question: " + q);
            }
        }

        System.out.println("\nQuestions:");
        for (Question q : questionPool) {
            System.out.println(q);
        }

        System.out.println("\nEquals check:");
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals c3? " + c1.equals(c3));

        scanner.close();
    }
}