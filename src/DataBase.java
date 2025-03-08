 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataBase {
  static  int no = 1;
    // WRITER REOCORD STD
      public static void InsertData(String File_Name, String newData) {
        try {
            FileWriter writer = new FileWriter(File_Name, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(newData + System.getProperty("line.separator"));
            bufferedWriter.close();
            System.out.println("Record Insert successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }// WRITER REOCORD END
      
    // UPDATA REOCORD STD
      
          public static void UpdateData(String File_Name, String Search_By, String newData) {
        try {
            File inputFile = new File(File_Name);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                String id = String.valueOf((char) Integer.parseInt(fields[0].trim()));
                if (id == Search_By) {
                    writer.write(newData + System.getProperty("line.separator"));
                    found = true;
                } else {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            if (!found) {
                System.out.println("Record with ID " + Search_By + " not found.");
            } else {
                if (inputFile.delete()) {
                    tempFile.renameTo(inputFile);
                    System.out.println("Record updated successfully.");
                } else {
                    System.out.println("Unable to update the record.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

      
    
   // UPDATA REOCORD END
     
     // DELETE REOCORD SRD
   public static void DeleteData(String File_Name, int Search_By) {
        try {
            File inputFile = new File(File_Name);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                int id =Integer.parseInt (fields[1].trim()); 
                if (id == Search_By) {
                    found = true;
                } else {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
            if (!found) {
                System.out.println("Record with ID " + Search_By + " not found.");
            } else {
                if (inputFile.delete()) {
                    tempFile.renameTo(inputFile);
                    System.out.println("Record deleted successfully.");
                } else {
                    System.out.println("Unable to delete the record.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }// DELETE REOCORD END
    // DISPLAY REOCORD SRD
       public static void SeletData(String File_Name, int searchId) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(File_Name));

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                int id = Integer.parseInt(fields[0].trim());
                if (id == searchId) {
                    System.out.println("ID: " + fields[0].trim());
                    System.out.println("Name: " + fields[1].trim());
                    System.out.println("Email: " + fields[2].trim());
                    System.out.println("Department: " + fields[3].trim());
                    System.out.println("Year: " + fields[4].trim());
                    found = true;
                    break;
                }
            }
            reader.close();
            if (!found) {
                System.out.println("Record with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    } // DISPLAY REOCORD END
       
       
       
       
       // ID_Checker_DataBase SRD
       public static int ID_Checker_DataBase(int Type) {
          int value = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ID Checker.txt"));

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                int id = Integer.parseInt(fields[0].trim());
                if (id == Type) {
                    value = Integer.parseInt(fields[2].trim());
                    found = true;
                    break;
                }
                
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return value;
    }
             
          public static void ID_Checker_UpdateData(int Index, String newData) {
        try {
            File inputFile = new File("ID Checker.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            boolean found = false;

            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                int id = Integer.parseInt(fields[0].trim());
                if (id == Index) {
                    writer.write(newData + System.getProperty("line.separator"));
                    found = true;
                } else {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            writer.close();
            reader.close();
                if (inputFile.delete()) {
                    tempFile.renameTo(inputFile);
                    
                }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
         // ID_Checker_DataBase END

          // DISPLAY REOCORD SRD
       public static void SelectCourseData(String File_Name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(File_Name));

            String currentLine;
            boolean found = false;
System.out.println("No\tCourseCode\tCourseName\tCreditHour\tyear\tSemester");
                      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
              
             
                    System.out.print(+ no);
                    System.out.print("        " + fields[1].trim());
                    System.out.print("\t\t" + fields[0].trim());
                    System.out.print("\t\t  " + fields[2].trim());
                    System.out.print("\t          " + fields[3].trim());
                    System.out.print("\t"
                            + "" + fields[4].trim());
                    System.out.print("\n");
                     System.out.println("-------------------------------------------------------------------------------");
                    no ++;
                
            }
            no = 1;
            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    } // DISPLAY REOCORD END
          
       // DISPLAY REOCORD SRD
        public static void SeletStudentData(String File_Name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(File_Name));

            String currentLine;
            boolean found = false;
System.out.println("No\tID\tName\\tEmail\\tDepartment\\tYear");
                      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
              
             
                    System.out.print(+ no);
                    System.out.print("        " + fields[1].trim());
                    System.out.print("\t\t" + fields[0].trim());
                    System.out.print("\t\t  " + fields[2].trim());
                    System.out.print("\t          " + fields[3].trim());
                    System.out.print("\t"
                            + "" + fields[4].trim());
                    System.out.print("\n");
                     System.out.println("-------------------------------------------------------------------------------");
                    no ++;
                
            }
            no = 1;
            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    } // DISPLAY REOCORD END
       public static void SearchStudentData(String File_Name, String searchId) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(File_Name));

            String currentLine;
            boolean found = false;
 while ((currentLine = reader.readLine()) != null) {
                String[] fields = currentLine.split(",");
                String id = String.valueOf((char) Integer.parseInt(fields[0].trim()));
                if (id == searchId) {
                    System.out.println("ID: " + fields[0].trim());
                    System.out.println("Name: " + fields[1].trim());
                    System.out.println("Email: " + fields[2].trim());
                    System.out.println("Department: " + fields[3].trim());
                    System.out.println("Year: " + fields[4].trim());
                    found = true;
                    break;
                }
            }
            reader.close();
            if (!found) {
                System.out.println("Record with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    } // DISPLAY REOCORD END
   
}
