import java.util.Scanner;
public class StudentPage {
     static int DoRe = 0, MeRe = 0;
    public void MainPage(){
        Scanner input = new Scanner(System.in);   
        do{
            do{
            MeRe = 0;
        System.out.println("\n\n\t MEKELLE UNIVERSITY \n\t\tSTUDENT PAGE\n");
                System.out.println("\t---------------------------");
                System.out.println("\t| 1 My Information        |");
                System.out.println("\t| 2 Update Information    |");
                System.out.println("\t| 0 Log Out               |");
                System.out.println("\t---------------------------");
                System.out.print("\t Enter your Choice ");
                int student_Page_Choice,Register_Menu_Choice;
                student_Page_Choice = input.nextInt();
                switch(student_Page_Choice){
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 0:
                        DoRe = 1;
                        break;
                    default:
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Invalid choice. Enter another choice");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        MeRe = 1;
    }
                 }while(MeRe == 1);
            }while(DoRe == 0);
    
}
}