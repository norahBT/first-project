import java.util.Scanner;

public class lab8Lab7 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Level and Department:");
        int level=s.nextInt();
        String department; 

        while(level!=-1){
            department = s.next();

        switch(level){
            case 5:System.out.println("elective: Advanced Algebra");
            break;
            case 8:
                switch(department){
                    case "CS":  System.out.println("elective: Machine Learning");
                    break;
                    case "IS": System.out.println("elective: e-commerce");
                    break;
                    default: System.out.println("elective: web security");

                }
            break;
            default:  System.out.println("No electives");
        }

        System.out.println("Enter Level and Department or -1 to Exit");
         level=s.nextInt();
         


    }
}
}

