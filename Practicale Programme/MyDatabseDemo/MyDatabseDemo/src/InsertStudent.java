import java.sql.*;

//Class to insert Student records
public class InsertStudent {
    MyDbConnector mdc;
    public void insertStudent(String id, String name, String address){
        mdc = new MyDbConnector();
        Connection con = mdc.getMyConnection();
        PreparedStatement stmt;
        try {
            String myStatement = "INSERT INTO basicdata(stu_id, stu_name, stu_address) VALUES(?,?,?)";

            stmt = con.prepareStatement(myStatement);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, address);

            int rowCount = stmt.executeUpdate();
            if(rowCount > 0 ){
                System.out.println("A new Student added successfully...");
            }else {
                System.out.println("Fail to add a new Student record...");
            }
        } catch (SQLException ex) {
            System.out.println("Error in inserting a Student record" + ex.getMessage());
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
