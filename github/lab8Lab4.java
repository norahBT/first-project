//update the program in Lab 4 to create two versions of the guessing game. The first version forces the user to make three guesses.
// The second version allows the user to make a maximum of five guesses.
// The user should be able to stop playing the game even before making fives guesses. 

import java.util.Arrays;
import java.util.Scanner;

public class lab8Lab4 {
    public static void main(String[] args) {
        System.out.println("dear user welcome to the game! you will have five guesses as maximum or enter -1 if you want to exit.");
        Scanner input = new Scanner(System.in);

        int[] numbers = {13, 7, 23, 2, 29, 3, 5, 71, 11, 41, 17, 19, 53, 73, 31, 37, 97, 43, 47, 59, 61, 79, 67, 83, 89};
        int[] guesses = new int[5];
        int guess;
        System.out.println("dear player: welcome to the game. you could enter five guessess as maximum or enter -1 to stop playing");
        for (int i = 0; i < guesses.length; i++) {
            System.out.println("Enter guess: ");
            guess = input.nextInt();
            if(guess == -1){
                break;
            }
            guesses[i] = guess;
        }

        Arrays.sort(numbers);
        for (int i = 0; i < guesses.length; i++) {
            if(guesses[i] != 0)
            System.out.printf("%d found at index %d\n", guesses[i], Arrays.binarySearch(numbers, guesses[i]));


        }
    }
}