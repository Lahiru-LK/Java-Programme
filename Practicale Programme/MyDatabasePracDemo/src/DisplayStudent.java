import com.sun.source.tree.WhileLoopTree;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudent {
    private String id, name, address;
    private MyDbConnector mdc;
    private Connection con;

    private Statement stmt;

    private ResultSet rs;

    public void displayAllStudents(){
        mdc = new MyDbConnector();
        con = mdc.getMyConnection();

        try {
            //3. Creating the statement
            stmt = con.createStatement();
            String myQuery = "SELECT * FROM basicdata";

            //4. Executing the query
            rs = stmt.executeQuery(myQuery);

            while (rs.next()){
                id = rs.getString(1);
                name = rs.getString("stu_name");
                address = rs.getString(3);

                System.out.println(id + "\t" +name +"\t"+address);
            }

        } catch (SQLException e) {
            System.out.println("Error in display...."+ e.getMessage());
        }
        finally {
            try {
                //5. Close the connection
                con.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the Connection..."+ e.getMessage());
            }
        }
    }
    //Display a student by id
    //Display a name by id, address by id
}
