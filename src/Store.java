import java.util.Scanner;
public class Store {
    DataBase DATABASE = new DataBase();
int ID_check;
public void Checker(int input){
    ID_check = input;
}
     Scanner input = new Scanner(System.in);
     public void Register(){
         int UGR_ID_NO = 0, PGR_ID_NO = 0;
         String Student_Info = null, Final_UGR_ID_NO, Final_PGR_ID_NO;
         
               System.out.println("------------------------------------");
                         System.out.println("| 1 UGR                            |");
                         System.out.println("| 2 PGR                            |");
                         System.out.println("------------------------------------"); 
                         System.out.print("Enter your Choice ");
                         Register_Menu_Choice = input.nextInt();
                         STORE_PK.Checker(Register_Menu_Choice);
                         STORE_PK.Register();
       System.out.println("\n\nRegister Menu");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
               System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Name        |  ");   String NAME=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Email       |  ");   String EMAIL=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Year        |  ");   String YEAR=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");
                System.out.print("| Department  |  ");   String DEPARTMENT=input.nextLine();
                System.out.println("|-------------+  ----------------------------------");  
              if(ID_check == 1){
                    UGR_ID_NO = DATABASE.ID_Checker_DataBase(1);
                    UGR_ID_NO ++;
                    Final_UGR_ID_NO = "1, UGR, " + UGR_ID_NO;
                    DATABASE.ID_Checker_UpdateData(1,Final_UGR_ID_NO);
                String ID_UGR = "UGR/" + UGR_ID_NO +"/12";
                Student_Info = ID_UGR;
                Student_Info += ", ";
         Student_Info += NAME;
         Student_Info += ", ";
         Student_Info += EMAIL;
         Student_Info += ", ";
         Student_Info += YEAR;
         Student_Info += ", ";
         Student_Info += DEPARTMENT;
     }
              if(ID_check == 2){
                   PGR_ID_NO = DATABASE.ID_Checker_DataBase(2);
                    PGR_ID_NO ++;
                    Final_PGR_ID_NO = "2, PGR, " + PGR_ID_NO;
                    DATABASE.ID_Checker_UpdateData(2,Final_PGR_ID_NO);
                String ID_PGR = "PGR/" + PGR_ID_NO +"/12";
                Student_Info = ID_PGR;
                Student_Info += ", ";
         Student_Info += NAME;
         Student_Info += ", ";
         Student_Info += EMAIL;
         Student_Info += ", ";
         Student_Info += YEAR;
         Student_Info += ", ";
         Student_Info += DEPARTMENT;
     }
       DATABASE.InsertData("Store Info DataBase.txt", Student_Info);  
        
     
     }
}
