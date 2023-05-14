import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
    private MyDbConnector mdc;
    private Connection con;
    private PreparedStatement ps;

    public void deleteStudentById(String id){
        mdc = new MyDbConnector();
        con = mdc.getMyConnection();

        String myDelQuery = "DELETE FROM basicdata WHERE stu_id = ?";

        try {
            //3. Creating the statement
            ps = con.prepareStatement(myDelQuery);
            ps.setString(1,id);

            //4. Executing the query
            int rowCount = ps.executeUpdate();
            if(rowCount>0)
                System.out.println("Success in deleting a student record name by ID...");
            else
                System.out.println("Fail to delete a student record name by ID...");
        } catch (SQLException e) {
            System.out.println("Error in delete a record..."+e.getMessage());
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

    //delete student by name
}
