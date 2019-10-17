package com.company;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main<Public> {


    public static void main(String[] args) {


       int TypeGame = TypeMath();

       if (TypeGame == 1){
           AddGame();
       }

       if (TypeGame == 2) {
           int level = difficultylvl();

           if (level == 1) {

               if (Multigame() > 75.0) {
                   System.out.println("Congratulations, You're ready for the next level!");
                   return;
               }

               double percentage = 0;

               do {
                   percentage = Multigame();
               }

               while (percentage < 75.0);
           }
           if (level == 2) {
               if (Multigame2() >= 75.0) {
                   System.out.println("Congratulations, You're ready for the next level!");
                   
               }

               double percentage = 0;

               do {
                   percentage = Multigame2();
               }

               while (percentage < 75.0);

           }

           if (level == 3) {
               if (Multigame3() >= 75.0) {
                   System.out.println("Congratulations, You're ready for the next level!");
                   return;
               }

               double percentage = 0;

               do {
                   percentage = Multigame3();
               }

               while (percentage < 75.0);

           }

           if (level == 4) {
               if (Multigame4() >= 75.0) {
                   System.out.println("Congratulations, You're ready for the next level!");
                   return;
               }

               double percentage = 0;

               do {
                   percentage = Multigame4();
               }

               while (percentage < 75.0);

           }
       }

       if (TypeGame == 3){
           SubGame();
       }

       if(TypeGame == 4){
           DivGame();
       }


    }


    public static double Multigame() {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(10);
            int rand2 = rand.nextInt(10);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double ansKey = rand1 * rand2;
            double userAns;


            System.out.println("What is " + rand1 + " times " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == ansKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != ansKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }
        }


        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;
    }


    public static int difficultylvl() {
        int difficulty;
        Scanner scnr = new Scanner(System.in);
        System.out.println("please enter of difficulty: from 1 - 4");
        difficulty = scnr.nextInt();
        return difficulty;
    }

    public static double Multigame2() {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(100);
            int rand2 = rand.nextInt(100);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double ansKey = rand1 * rand2;
            double userAns;


            System.out.println("What is " + rand1 + " times " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == ansKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != ansKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }
        }


        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;
    }

    public static double Multigame3() {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(1000);
            int rand2 = rand.nextInt(1000);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double ansKey = rand1 * rand2;
            double userAns;


            System.out.println("What is " + rand1 + " times " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == ansKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != ansKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }
        }


        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;

    }

    public static double Multigame4()

    {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(10000);
            int rand2 = rand.nextInt(10000);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double MultiAnsKey = rand1 * rand2;
            double userAns;


            System.out.println("What is " + rand1 + " times " + rand2 + "? ");
                userAns = scnr.nextInt();


                if (userAns == MultiAnsKey) {
                    switch (rand3) {
                        case 0:
                            System.out.println("Very good!");
                            break;
                        case 1:
                            System.out.println("excellent!");
                            break;
                        case 2:
                            System.out.println("Nice Work!");
                            break;
                        case 3:
                            System.out.println("Keep up the good work!");
                            break;

                    }

                    correctAns++;

                }

                if (userAns != MultiAnsKey) {
                    switch (rand4) {
                        case 0:
                            System.out.println("No. Please try again.");
                            break;
                        case 1:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 2:
                            System.out.println("Don’t give up!");
                            break;
                        case 3:
                            System.out.println("No. Keep trying!");
                            break;

                    }

                    incorrectAns++;


                }

            }

            perCorrect = (correctAns / 10.0) * 100.0;
            perIncorrect = (incorrectAns / 10.0) * 100.0;


            System.out.println("You got " + perCorrect + "% correct");
            System.out.println("You got " + perIncorrect + "% incorrect");


            return perCorrect;


    }

    public static int TypeMath(){
        Scanner scnr = new Scanner(System.in);
        int MathType;
        System.out.println("Please enter what math you want to study:");
        System.out.print("1. Addition\n 2. Multiplication\n 3. Subtraction\n 4. Division\n");
        MathType = scnr.nextInt();

        return MathType;
    }

    public static double AddGame(){
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(10000);
            int rand2 = rand.nextInt(10000);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double AddAnsKey = rand1 + rand2;
            double userAns;


            System.out.println("What is " + rand1 + " + " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == AddAnsKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != AddAnsKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }

        }

        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;

    }

    public static double SubGame(){
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int correctAns = 0;
        int incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(10000);
            int rand2 = rand.nextInt(10000);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double SubAnsKey = rand1 - rand2;
            double userAns;


            System.out.println("What is " + rand1 + " - " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == SubAnsKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != SubAnsKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }

        }

        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;
    }

    public static double DivGame(){
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        double correctAns = 0;
        double incorrectAns = 0;
        double perCorrect, perIncorrect;


        for (int i = 0; i < 10; i++) {
            int rand1 = rand.nextInt(10000);
            int rand2 = rand.nextInt(10000);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);
            double DivAnsKey = rand1 / rand2;
            double userAns;


            System.out.println("What is " + rand1 + " / " + rand2 + "? ");
            userAns = scnr.nextInt();


            if (userAns == DivAnsKey) {
                switch (rand3) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correctAns++;

            }

            if (userAns != DivAnsKey) {
                switch (rand4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying!");
                        break;

                }

                incorrectAns++;


            }

        }

        perCorrect = (correctAns / 10.0) * 100.0;
        perIncorrect = (incorrectAns / 10.0) * 100.0;


        System.out.println("You got " + perCorrect + "% correct");
        System.out.println("You got " + perIncorrect + "% incorrect");


        return perCorrect;
    }

}



















