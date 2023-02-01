import java.sql.Array;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int winningNum;
        int[] numsGuessed = new int[randomNumber];

        System.out.println("Enter a Number 1-100, the program will try to guess it");
        winningNum = scanner.nextInt();

        do {
            System.out.println(randomNumber);
        } while (randomNumber != winningNum);

        if (randomNumber < winningNum) {
            System.out.println("higher");
        } if (randomNumber > winningNum) {
            System.out.println("lower");
        } else {
            if (randomNumber == winningNum) {
                System.out.println("Correct!");
            }
        }

    }
}









        // -------------------------------------------5Q's true || false quiz------------------------------------------
        // Display Q, ask user to enter true || false
        // Move to next Q
        // Display Score at end
        // Use 3 Arrays - String for holding Qs, Boolean for answers, Boolean for users answers
        // Use Scanner nextBoolean() method to get user input

//        Scanner scanner = new Scanner(System.in);
//        String[] questionsArr = new String[]{"The Moon comes out at night",
//                "The Sun is blue",
//                "Biden is the president",
//                "Cars have 4 wheels",
//                "Lava is cold"};
//        Boolean[] answers = new Boolean[]{true, false, true, true, false};
//        Boolean[] userAnswers = new Boolean[5];
//        String trueFalse = "True or False?";
//        int score = 0;
//
//        for (int i = 0; i <= questionsArr.length; i++) {
//            System.out.format(String.format("%s: %s%n", trueFalse, questionsArr[i]));
//            userAnswers[i] = scanner.nextBoolean();
//
//            if (userAnswers[i] == answers[i]) {
//                score++;
//            }
//            if (userAnswers[4] != null) {
//                System.out.println("Your score is: " + score);
//                break;
//            }
//        }


//        -----------------------------------------------Student Exam Grades-------------------------------------------
//        System.out.println("What is the MAX Score?");
//        int maxScore = scanner.nextInt();
//
//        System.out.println("How many students took the Exam?");
//        int numExams = scanner.nextInt();
//
//        int[] totalExams = new int[numExams];
//
//        System.out.println("Enter Student Score:");
//        for (int i = 0; i < totalExams.length; i++) {
//            System.out.println("Student " + (i + 1) + ": ");
//            totalExams[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < totalExams.length; i++) {
//            double studentScore = totalExams[i];
//            double studentPercentage = ((double)totalExams[i] / maxScore) * 100;
//
//            System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
//            sum += studentScore;
//        }
