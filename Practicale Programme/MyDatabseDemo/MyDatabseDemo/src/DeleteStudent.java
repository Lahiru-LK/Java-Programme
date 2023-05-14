import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Class to delete Student records
public class DeleteStudent {
    MyDbConnector mdc;
    //Method used to delete a student
    public void deleteStudentById(String id){
        mdc = new MyDbConnector();
        Connection con = mdc.getMyConnection();
        PreparedStatement stmt;
        try {
            String myStatement = "DELETE FROM basicdata WHERE stu_id = ?";

            stmt = con.prepareStatement(myStatement);
            stmt.setString(1, id);

            int rowsDeleted = stmt.executeUpdate();
            if(rowsDeleted > 0 ){
                System.out.println("Deleted the Student successfully...");
            }else {
                System.out.println("Fail to delete the Student...");
            }
        } catch (SQLException ex) {
            System.out.println("Error in deleting the Student record" + ex.getMessage());
        }finally {
            try {
                //close the connection
                con.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection" + e.getMessage());
            }
        }
    }
}
