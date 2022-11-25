import java.util.Scanner;

public class Lab8Lab5 {
 
    public static void main(String args[]) {
        
        //input
        //http://www.amazon.com
        //https://www.alrajhibank.com
        //http://www.imamu.edu

        Scanner input = new Scanner (System.in); 
        String url1;
        int c=0;
        while(c<3){

        System.out.println("Enter a URL");
        url1=input.next();
    

        //process URL 1
        int index1, index2, index3;
        index1=url1.indexOf(":");
        index2=url1.indexOf(".");
        index3=url1.indexOf(".", index2+1); 

      
        //output
        
        System.out.println("----------------------------");
        System.out.printf("%5s|%15s|%5s%n", url1.substring(0, index1), url1.substring(index2+1, index3), url1.substring(index3+1));
          System.out.println("----------------------------");

          c++;

        }
}}


