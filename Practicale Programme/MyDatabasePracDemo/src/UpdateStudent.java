import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
    private MyDbConnector mdc;
    private Connection con;
    private PreparedStatement ps;

    public void updateStudentNameById(String id, String upName){
        mdc = new MyDbConnector();
        con = mdc.getMyConnection();

        String myUpdtQuery = "UPDATE basicdata SET stu_name = ? WHERE stu_id = ?";

        try {
            //3. Creating the statement
            ps = con.prepareStatement(myUpdtQuery);
            ps.setString(1,upName);
            ps.setString(2, id);

            //4. Executing the query
            int rowCount = ps.executeUpdate();
            if(rowCount>0)
                System.out.println("Success in updating a student record name by ID...");
            else
                System.out.println("Fail to update a student record name by ID...");
        } catch (SQLException e) {
            System.out.println("Error in updating a record..."+e.getMessage());
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

    //update addrees by id,
    //update nname and address by id
}
