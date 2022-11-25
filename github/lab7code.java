
    import java.util.Scanner;

public class lab7code {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Level and Department:");
        int level=s.nextInt();
        String department = s.next();


            switch(level){
            case 5:System.out.println("elective: Advanced Algebra");
            break;
            case 8:
            if (department.equals("CS")) // or you can use method > department.equalsIgnoreCase("CS")
            System.out.println("elective: Machine Learning");
            else if (department.equals("IS"))
            System.out.println("elective: e-commerce");
            else 
            System.out.println("elective: web security");
            break;
            default:  System.out.println("No electives");
        }



       

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






        //Virsion 1
             //if level 5 or 8 or other
        // if 8 if dep cs or is or other

        if (level==5)
            System.out.println("elective: Advanced Algebra");
        
        else if (level==8)
            if (department.equals("CS")) // or you can use method > department.equalsIgnoreCase("CS")
            System.out.println("elective: Machine Learning");
            else if (department.equals("IS"))
            System.out.println("elective: e-commerce");
            else 
            System.out.println("elective: web security");
        
        else 
        System.out.println("No electives");




    }
}




