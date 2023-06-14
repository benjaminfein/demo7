package main.java.com.example.demo7;

import java.util.*;

public class GameClass {
    public static void game(String[] words) {
        Random randomIndex = new Random();
        int i = randomIndex.nextInt(words.length);
        String rightAnswer = words[i];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, User!" + '\n' + "Today we gonna play a game where you have to guess a word. "
                + "So at first, this is our list of words:" + '\n' + Arrays.toString(words) + '\n'
                + "Choose one and enter it: ");
        String possibleAnswer = scanner.nextLine().toLowerCase(Locale.ROOT).strip();

        while(!Objects.equals(possibleAnswer, rightAnswer)) {
            System.out.println("Incorrect!" + '\n' + "Let me give you a hint: " + rightAnswer.toCharArray()[0]
                    + rightAnswer.toCharArray()[1] + "*************" + '\n' + "Try again: ");
            possibleAnswer = scanner.nextLine().toLowerCase(Locale.ROOT).strip();
        }

        System.out.println("Correct! Hidden word was <<" + possibleAnswer + ">>");
    }
}
