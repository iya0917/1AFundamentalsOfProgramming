public class QuizGrader { // pangalan ng class
        public static void main(String[] args) { // start ng program

            char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; // array ng answer key ng quiz
            char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; // array ng sagot ng student

            int correctCount = 0; // taga-bilang ng tamang sagot

            System.out.println("--- Missed Questions ---"); // para ma-print yung title
            for (int i = 0; i < answerKey.length; i++) { // for loop

                char student = Character.toUpperCase(studentAnswers[i]); // para maging uppercase yung mga laman
                char correct = Character.toUpperCase(answerKey[i]); // para maging uppercase yung mga laman

                if (student == correct) { // para makta kung tugma ang sagot ng estudyante sa answer key
                    correctCount++; // para madagdagan yung score kung tama ang sagot
                } else { // kung mali ang sagot
                    System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + student + "', correct answer is '" + correct + "'"); // para ma-print yung number, sagot ng estudyante, at ang tamang sagot
                }
            }

            double scorePercentage = (double) correctCount / answerKey.length * 100; // kinukuha kung ilan yung total score at minumultiply ng 100

            System.out.println("\n--- Results ---"); // para ma-print yung title
            System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length); // ipinapakita yung total na score
            System.out.println("Score: " + scorePercentage + "%"); // ipinapakita ang final na percent

            if (scorePercentage >= 70.0) { // tinitignan kung mas mataas ang percent kaysa sa 70.0
                System.out.println("Result: PASS"); // pumasa ang estudyante
            } else { // kung mas mababa sa 70.0
                System.out.println("Result: FAIL"); // bumagsak ang estudyante
            }
        }
    }
