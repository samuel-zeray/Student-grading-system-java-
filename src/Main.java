
import java.util.Scanner;

public class Main {
    static int DoRe = 0, MeRe = 0;

   
    
    public static void main(String[] args) {
     /*  DataBase DATABASE = new DataBase();
        Scanner Input = new Scanner(System.in);
        String File_Name = "Store Info DataBase.txt";
        int recordIndexToUpdate = 5, recordIndexToDelete = 2; 
        int nu = 1000;
        int Input_ID_No = Input.nextInt();
        String newData = "UGR/178057/12, Nathnael Balcha, Nati@example.com, Computer Science, 2nd";
        for (int i= 0; i< 5; i++){
            
        }
        Input.nextLine();
        
       //DATABASE.UpdateData(File_Name, recordIndexToUpdate, newData);
       //DATABASE.DeleteData(File_Name, recordIndexToDelete);
       //DATABASE.InsertData(File_Name, newData);
       DATABASE.SeletData(File_Name,Input_ID_No);
*/
     
     
     
     
             //   Store STORE_PK = new Store();
                StudentPage Student_Page = new StudentPage();
                ManagementPage Management_Page = new ManagementPage();
                LoginSystem LOG_S = new LoginSystem();
                Scanner input = new Scanner(System.in);
                
                LOG_S.users.add(new User("admin","12345"));
                do{
                System.out.println("\n\tMEKELLE UNIVERSITY LOGIN PAGE\n");
                System.out.println("\t---------------------------");
                System.out.println("\t| 1 Management            |");
                System.out.println("\t| 2 Student               |");
                System.out.println("\t| 0 Exit                  |");
                System.out.println("\t---------------------------");
                System.out.print("\t Who is logging ");
                int Log_in_Choice=input.nextInt(),Register_Menu_Choice;
                input.nextLine();
                switch(Log_in_Choice){
                    case 1:
                    
                        do{
                            DoRe = 0;
                            System.out.println("\n\n\t MEKELLE UNIVERSITY\n\t\tMANAGEMENT LOGIN PAGE\n");
                             System.out.println("           |----------------------------------|");
                            System.out.print(" Name        ");   String username = input.nextLine();
                            System.out.println("           |----------------------------------|");
                            System.out.print(" Password    ");   String password = input.nextLine();
                            System.out.println("           |----------------------------------|");
                            
                            if (LOG_S.authenticateUser(username, password)) {
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Login successful. Welcome, " + username + "!");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                Management_Page.MainPage();
                            } else {
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Mangement Login Fill");
                                System.out.println("Invalid username or password. Please try again.");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            MeRe = 1;
                            }
                        } while(DoRe == 1);
                    
                         
            
                          break;

                    case 2:
                        do{
                            DoRe = 0;
                            System.out.println("\n\n\t MEKELLE UNIVERSITY \n\t\tSTUDENT LOGIN PAGE\n");
                            System.out.println("           |----------------------------------|");
                            System.out.print(" Name        ");   String username = input.nextLine();
                            System.out.println("           |----------------------------------|");
                            System.out.print(" Password    ");   String password = input.nextLine();
                            System.out.println("           |----------------------------------|");
                            
                            if (LOG_S.authenticateUser(username, password)) {
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Login successful. Welcome, " + username + "!");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                               Student_Page.MainPage();
                            } else {
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Student Login Fill");
                                System.out.println("Invalid username or password. Please try again.");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            MeRe = 1;
                            }
                            
                            
                                   
                        } while(DoRe == 1);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Invalid choice. Enter another choice");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }MeRe = 1;
                }while(MeRe == 1);
    }
    
}
