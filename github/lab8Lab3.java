//update the program in Lab 3 to allow the user to enter a 4-bit binary number as a String of characters.
// Whenever the user enters a string that has less than 4 bits or more than 4 bits,
// your program should repeatedly ask the user for a binary string until the user correctly enters a 4-bit binary String. 
//Your program should then proceed to calculating the decimal equivalent. 

import java.util.Scanner;

public class lab8Lab3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter four bits:");
        String binaryBits = input.next();
        while (binaryBits.length() != 4){
            System.out.println("Incorrect, please enter four bits: ");
            binaryBits = input.next();
        }
        int decimal = 0;

        for(int i=binaryBits.length()-1;i>=0;i--){
            if(binaryBits.charAt(binaryBits.length() - i - 1) == '1'){
               decimal += Math.pow(2,i) ;
            }
        }
        System.out.println(decimal);
    }

}



