import java.util.Scanner;
public class ManageCourse {
    DataBase DATABASE = new DataBase();
    Scanner input= new Scanner(System.in);
     static int DoRe = 0, MeRe = 0;
    public void ManageCoursePage(){ 
        do{
            do{
            MeRe = 0;
        System.out.println("\n\n\t MEKELLE UNIVERSITY \n\t\t\tCOURSE MANAGE PAGE\n");
                System.out.println("\t-------------------------------");
                System.out.println("\t| 1 Add Course                |");
                System.out.println("\t| 2 Display Courses           |");
                System.out.println("\t| 3 Update Course             |");
                System.out.println("\t| 4 Delete a Course           |");
                System.out.println("\t| 0 Back                      |");
                System.out.println("\t-------------------------------");
                System.out.print("\t Enter your Choice ");
                int courseMange_Page_Choice;
                courseMange_Page_Choice = input.nextInt();
                input.nextLine();
                switch(courseMange_Page_Choice){
                    case 1:
                        addCourse();
                        break;
                    case 2:
                        displayCourse();
                        break;
                    case 3:
                        updateCourse();
                        break;
                    case 4:
                        deleteCourse();
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
    
                   public void  addCourse(){
                        
         String Course_Info = null;
  
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
               System.out.println("|--------------+  ----------------------------------");
                System.out.print("| Course Name          |  ");   String CourseName=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Course Code          |  ");   int CourseCode=input.nextInt();input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Credit Hour           |  ");   String CreditHour=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Course Year        |  ");   String year=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Semester   |  ");   String Semester=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                
                    
         Course_Info = CourseName;
         Course_Info += ", ";
         Course_Info += CourseCode;
         Course_Info += ", ";
         Course_Info += CreditHour;
         Course_Info += ", ";
         Course_Info += year;
         Course_Info += ", ";
         Course_Info += Semester;
         Course_Info += ", ";
     
       DATABASE.InsertData("Course Info DataBase.txt",Course_Info);  
 }
                   
            public void   displayCourse(){
             DATABASE.SelectCourseData("Course Info DataBase.txt");  
            }
                
       
            public void   updateCourse(){
             
                String updateCourse_Info = null;
                System.out.println("Enter Course Code you want to update");
              String  course_code=input.nextLine();
              
                System.out.println("|--------------+  ----------------------------------");
                System.out.print("| Course Name          |  ");   String CourseName=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Course Code          |  ");  course_code=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Credit Hour          |  ");   String CreditHour=input.nextLine();              
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Course Year        |  ");   String year=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Semester   |  ");   String Semester=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                
                    
         updateCourse_Info = CourseName;
         updateCourse_Info += ", ";
         updateCourse_Info += course_code;
         updateCourse_Info += ", ";
         updateCourse_Info += CreditHour;
         updateCourse_Info += ", ";
         updateCourse_Info += year;
         updateCourse_Info += ", ";
         updateCourse_Info += Semester;
         updateCourse_Info += ", ";
               DATABASE.UpdateData("Course Info DataBase.txt",course_code,updateCourse_Info);  

            }   
                      

 public void   deleteCourse(){
                
                System.out.println("Enter Course Code you want to delete");
              int  course_code=input.nextInt();
              input.nextLine();
               DATABASE.DeleteData("Course Info DataBase.txt", course_code);
             }
}
