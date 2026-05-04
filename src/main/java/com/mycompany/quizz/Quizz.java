/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizz;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Quizz {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Parallel arrays for questions, options, and answers
        String[] strQuestions = {
            "1. Which artist released the album 'Thriller' in 1982?",
            "2. What is the best-selling single of all time?",
            "3. Which band performed 'Bohemian Rhapsody'?",
            "4. In which decade did hip-hop music originate?",
            "5. Which artist is known as the 'Queen of Pop'?",
            "6. What instrument does a drummer play?",
            "7. Which country does the music genre 'Afrobeats' originate from?",
            "8. What does 'BPM' stand for in music?",
            "9. Which artist released 'Rolling in the Deep'?",
            "10. What is the term for the speed of a piece of music?"
        };

        String[][] strOptions = {
            {"A. Prince", "B. Michael Jackson", "C. Elvis Presley", "D. David Bowie"},
            {"A. Shape of You", "B. Blinding Lights", "C. White Christmas", "D. Uptown Funk"},
            {"A. The Beatles", "B. Led Zeppelin", "C. Queen", "D. The Rolling Stones"},
            {"A. 1950s", "B. 1960s", "C. 1970s", "D. 1980s"},
            {"A. Beyonce", "B. Rihanna", "C. Lady Gaga", "D. Madonna"},
            {"A. Guitar", "B. Piano", "C. Drum kit", "D. Violin"},
            {"A. Ghana", "B. Nigeria", "C. South Africa", "D. Kenya"},
            {"A. Bass Per Minute", "B. Beats Per Measure", "C. Beats Per Minute", "D. Bars Per Minute"},
            {"A. Adele", "B. Beyonce", "C. Taylor Swift", "D. Rihanna"},
            {"A. Pitch", "B. Tempo", "C. Rhythm", "D. Dynamics"}
        };

        String[] strCorrectAnswers = {"B", "C", "C", "C", "D", "C", "B", "C", "A", "B"};

        int numCorrect = 0;
        int numIncorrect = 0;

        System.out.println("==========================================");
        System.out.println("         WELCOME TO THE MUSIC QUIZ");
        System.out.println("==========================================");
        System.out.println("Answer each question with A, B, C, or D.");
        System.out.println();

        for (int i = 0; i < strQuestions.length; i++) {
            System.out.println(strQuestions[i]);
            for (String option : strOptions[i]) {
                System.out.println("  " + option);
            }
            System.out.print("Your Answer: ");
            String strUserAnswer = input.nextLine().trim().toUpperCase();

            if (strUserAnswer.equals(strCorrectAnswers[i])) {
                System.out.println(">> Correct! Well done!");
                numCorrect++;
            } else {
                System.out.println(">> Incorrect. The correct answer was: " + strCorrectAnswers[i]);
                numIncorrect++;
            }
            System.out.println();
        }

        // Calculate percentage
        double numPercentage = ((double) numCorrect / strQuestions.length) * 100;

        System.out.println("==========================================");
        System.out.println("              QUIZ RESULTS");
        System.out.println("==========================================");
        System.out.println("Correct Answers  : " + numCorrect);
        System.out.println("Incorrect Answers: " + numIncorrect);
        System.out.printf("Percentage       : %.1f%%\n", numPercentage);
        System.out.println("==========================================");

        input.close();
    }
}
    
        
    
        
