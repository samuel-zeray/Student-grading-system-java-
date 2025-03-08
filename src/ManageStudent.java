import java.util.Scanner;
public class ManageStudent {
    DataBase DATABASE = new DataBase();
     Scanner input = new Scanner(System.in);
     static int DoRe = 0, MeRe = 0;
    public void ManageStudentPage(){
      
        do{
            do{
            MeRe = 0;
        System.out.println("\n\n\t MEKELLE UNIVERSITY \n\t\tMANAGE STUDENT PAGE\n");
                System.out.println("\t-------------------------------");
                System.out.println("\t| 1 Register New Student      |");
                System.out.println("\t| 2 Add Student Score         |");
                System.out.println("\t| 3 Search Student            |");
                System.out.println("\t| 4 Display All Students info |");
                System.out.println("\t| 5 Update Student Info       |");
                System.out.println("\t| 6 Delete Student            |");
                System.out.println("\t| 0 Back                      |");
                System.out.println("\t-------------------------------");
                System.out.print("\t Enter your Choice ");
                int studentManage_Page_Choice;
                studentManage_Page_Choice = input.nextInt();
                input.nextLine();
                switch(studentManage_Page_Choice){
                    case 1:
                        Register();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                               displayStudent(); 

                        break;
                    case 5:
                        updateStudent();
                        break;
                    case 6:
                        deleteStudent();
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
    
    
  

  
    public void Register(){
         
    



         int RGR_ID_NO = 0, EGR_ID_NO = 0;
         String Student_Info = null, Final_RGR_ID_NO, Final_EGR_ID_NO;
         System.out.println("------------------------------------");
         System.out.println("| 1 Regular Student                |");
         System.out.println("| 2 Extension Student              |");
         System.out.println("------------------------------------"); 
                         System.out.print("Enter your Choice ");
         int Register_Menu_Choice = input.nextInt();
         input.nextLine();
                     double SCORE[]=null;    
                         
       System.out.println("\n\nRegister Menu");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
               System.out.println("|--------------+  ----------------------------------");
                System.out.print("| Name          |  ");   String NAME=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Email          |  ");   String EMAIL=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Year           |  ");   String YEAR=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Gender        |  ");   String GENDER=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Department  |  ");   String DEPARTMENT=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Score          |  ");   for(int i=0;i<5;i++){System.out.println("Enter score");  SCORE[i]=input.nextDouble();}
                System.out.println("|-------------+  ----------------------------------");
                
              if(Register_Menu_Choice == 1){
                
                    RGR_ID_NO = DATABASE.ID_Checker_DataBase(1);
                    RGR_ID_NO ++;
                    Final_RGR_ID_NO = "1, RGR, " + RGR_ID_NO;
                 ReularStudent regular= new ReularStudent(Final_RGR_ID_NO,NAME,YEAR,GENDER,DEPARTMENT,EMAIL,SCORE);
                    DATABASE.ID_Checker_UpdateData(1,Final_RGR_ID_NO);
                String ID_RGR = "RGR/" + RGR_ID_NO +"/12";
                Student_Info = ID_RGR;
                Student_Info += ", ";
         Student_Info += NAME;
         Student_Info += ", ";
         Student_Info += EMAIL;
         Student_Info += ", ";
         Student_Info += YEAR;
         Student_Info += ", ";
         Student_Info += DEPARTMENT;
         Student_Info += SCORE;
     }
              if(Register_Menu_Choice == 2){
        
                   EGR_ID_NO = DATABASE.ID_Checker_DataBase(2);
                    EGR_ID_NO ++;
                    Final_EGR_ID_NO = "2, EGR, " + EGR_ID_NO;
                     ExtensionStudent regular= new ExtensionStudent(Final_EGR_ID_NO,NAME,YEAR,GENDER,DEPARTMENT,EMAIL,SCORE);
                    DATABASE.ID_Checker_UpdateData(2,Final_EGR_ID_NO);
                String ID_EGR = "EGR/" + EGR_ID_NO +"/12";
                Student_Info = ID_EGR;
                Student_Info += ", ";
         Student_Info += NAME;
         Student_Info += ", ";
         Student_Info += EMAIL;
         Student_Info += ", ";
         Student_Info += YEAR;
         Student_Info += ", ";
         Student_Info += DEPARTMENT;
         Student_Info += SCORE;
     }
       DATABASE.InsertData("Student Info DataBase.txt", Student_Info);  
        
     
     }
     public void   searchStudent(){
                
                System.out.println("Enter Student Id you want to delete");
              String  Student_Id=input.nextLine();
              input.nextLine();
               DATABASE.SearchStudentData("Student Info DataBase.txt", Student_Id);
             }
              public void   displayStudent(){
             DATABASE.SeletStudentData("Student Info DataBase.txt");  
            }
                
       
            public void   updateStudent(){
             
                String Student_update = null;
                System.out.println("Enter Course Code you want to update");
              String  Student_Id=input.next();
              input.nextLine();
                System.out.println("\n\nUpdate Menu");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
               System.out.println("|--------------+  ----------------------------------");
                System.out.print("| Name          |  ");   String NAME=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Email          |  ");   String EMAIL=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Year           |  ");   String YEAR=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Gender        |  ");   String GENDER=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Department  |  ");   String DEPARTMENT=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                
         Student_update = Student_Id;
         Student_update += ", ";
         Student_update += NAME;
         Student_update += ", ";
         Student_update += EMAIL;
         Student_update += ", ";
         Student_update += YEAR;
         Student_update += ", ";
         Student_update += DEPARTMENT;
       DATABASE.UpdateData("Student Info DataBase.txt", Student_Id,Student_update);

            }   
                      

 public void   deleteStudent(){
                
                System.out.println("Enter Student Id you want to delete");
              int  Student_Id=input.nextInt();
              input.nextLine();
               DATABASE.DeleteData("Student Info DataBase.txt", Student_Id);
             }
}
    
    
    
    
