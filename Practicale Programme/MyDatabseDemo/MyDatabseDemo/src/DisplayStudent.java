import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Class use to display student records from the basicdata table
public class DisplayStudent {
    String id, name, address;
    MyDbConnector mdc;
    public void displayAllStudents() {
        mdc = new MyDbConnector();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM basicdata";

            ResultSet rs = stmt.executeQuery(myStatement);

            while (rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                address = rs.getString(3);

                System.out.println(id + " , " + name + " , " + address);
            }
        } catch (SQLException ex) {
            System.out.println("Error in displaying all students" + ex.getMessage());
        } finally {
            try {
                //close the connection
                con.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection" + e.getMessage());
            }
        }
    }
}
