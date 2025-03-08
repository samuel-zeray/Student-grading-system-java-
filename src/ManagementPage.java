import java.util.Scanner;
public class ManagementPage {
     static int DoRe = 0, MeRe = 0;
    public void MainPage(){
        ManageStudent Manage_Student = new ManageStudent();
         ManageCourse Manage_Course = new ManageCourse();
        Scanner input = new Scanner(System.in);   
        do{
            do{
            MeRe = 0;
        System.out.println("\n\n\t MEKELLE UNIVERSITY \n\t\tMANAGEMENT PAGE\n");
                System.out.println("\t---------------------------");
                System.out.println("\t| 1 Manage Student        |");
                System.out.println("\t| 2 Manage Course         |");
                System.out.println("\t| 0 Log Out               |");
                System.out.println("\t---------------------------");
                System.out.print("\t Enter your Choice ");
                int managemtnt_Page_Choice;
                managemtnt_Page_Choice = input.nextInt();
                switch(managemtnt_Page_Choice){
                    case 1:
                        Manage_Student.ManageStudentPage();
                        break;
                    case 2:
                        Manage_Course.ManageCoursePage();
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