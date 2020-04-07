package Practice;

import java.sql.*;

public class StudentController {
    public void InsertStudent(Student student){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into students values (" + " '" + student.getStudentID() + "', '"  + student.getName() + "', '"  + student.getAddress() + "', '"+ student.getPhone() + "'" +")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void SelectStudent(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            System.out.println("============================================================================");
            ResultSet rset = stmt.executeQuery("select * from students");
            //Get the metadata of the  ResultSet
            ResultSetMetaData rsetMD = rset.getMetaData();
            //Get the number of column from metadata
            int numColumns = rsetMD.getColumnCount();

            //Print column names - Column Index begins at 1 (instead of 0)
            for ( int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            //Print column class names
            for (int i = 1 ; i <= numColumns; i++){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnName(i) + ")");
            }
            System.out.println();

            //Print column contents for all the rows
            while (rset.next()){
                for ( int i = 1; i <= numColumns; ++i){
                    //getString() can be used for all column types
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
