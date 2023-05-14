import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    private MyDbConnector mdc;
    private Connection con;
    private PreparedStatement ps;

    public void insertSingleStudent(String id, String name, String address){
        mdc = new MyDbConnector();
        con = mdc.getMyConnection();

        String myInsQuery = "INSERT INTO basicdata(stu_id, stu_name, stu_address) VALUES(?,?,?)";
        try {
            //3. Creating the statement
            ps = con.prepareStatement(myInsQuery);
            ps.setString(1,id);
            ps.setString(2,name);
            ps.setString(3, address);

            //4. Executing the query
            int rowCount = ps.executeUpdate();
            if(rowCount>0)
                System.out.println("Success in inserting a student record...");
            else
                System.out.println("Fail to insert a student record");

        } catch (SQLException e) {
            System.out.println("Error in inserting a record..."+e.getMessage());
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

    //insert multiple students

}
