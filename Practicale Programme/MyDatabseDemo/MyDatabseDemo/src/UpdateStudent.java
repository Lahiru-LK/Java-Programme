import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Class to update Student records
public class UpdateStudent {
    MyDbConnector mdc;
    //Method used to update the name
    public void updateStudentName(String id, String name){
        mdc = new MyDbConnector();
        Connection con = mdc.getMyConnection();
        PreparedStatement stmt;
        try {
            String myStatement = "UPDATE basicdata SET stu_name = ? WHERE stu_id = ?";

            stmt = con.prepareStatement(myStatement);
            stmt.setString(1, name);
            stmt.setString(2, id);

            int rowsAffected = stmt.executeUpdate();
            if(rowsAffected > 0 ){
                System.out.println("Updated the name of the Student successfully...");
            }else {
                System.out.println("Fail to update the name of the Student...");
            }
        } catch (SQLException ex) {
            System.out.println("Error in updating a Student record" + ex.getMessage());
        }finally {
            try {
                //close the connection
                con.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection" + e.getMessage());
            }
        }
    }
    //Write methods to upadte address only, name and address both
}
