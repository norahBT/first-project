import java.util.Scanner;

public class lab8Math {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Input ===========");
        System.out.println("Enter a number");
        int number = input.nextInt();

      
        System.out.println("========== factorial ===========");

        int counter=number, f=1;
        while(counter>0){
            f=f*counter;
            counter--;
        }

//
        System.out.printf("Factorial of %d is %d %n",number,f);

        System.out.println("========== Multi Tables =========");

        int j=1,i=number;
        while (i >= 1){
            j=1;///////////
            while (j<=10){
                System.out.printf(" %d x %d = %d\n",i,j,i*j);
                j++;
            }
            i--;
        }   

    }
}
