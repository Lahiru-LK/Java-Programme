import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GradeCalculator {
    private String Reg_No;
    private Float Quiz_01,Quiz_02,Quiz_03;
    private DBConnection mdc;
    private Connection con;

    private Statement stmt;

    private ResultSet rs;

    public void ShowDatabase() {
        try {

            stmt = con.createStatement();
            String myQuery = "SELECT * FROM marks";


            rs = stmt.executeQuery(myQuery);

            while (rs.next()){
                Reg_No = rs.getString(1);
                Quiz_01  = Float.valueOf(rs.getString(2));
                Quiz_02 = Float.valueOf(rs.getString(3));
                Quiz_03 = Float.valueOf(rs.getString(4));



                System.out.println(Reg_No + "\t" +Quiz_01 +"\t"+Quiz_02 +"\t"+Quiz_03);
            }

        } catch (SQLException e) {
            System.out.println("Error in display...."+ e.getMessage());
        }
        finally {
            try {

                con.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the Connection..."+ e.getMessage());
            }
        }
    }

}
