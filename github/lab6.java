import java.util.Scanner;

public class lab6 {

    public static void main (String args []){
        Scanner n= new Scanner(System.in); 

        System.out.println("Enter three integers");
        int n1=n.nextInt();
        int n2=n.nextInt();
        int n3=n.nextInt();

        int min=n1;
        if(n2<min)//n2<n1
            min=n2;
        if(n3<min)//n3<n2  in the original code it has a ; so it well stop at this line 
            min=n3;
            System.out.println("The smallest number is "+ min);
    }
    
}