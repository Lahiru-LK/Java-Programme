import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String url = "jdbc/mysql://localhost:3306/localhost";
    private String user = "root";
    private String password = "";


    private Connection myCon = null;

    private void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully Registered.....");
        }catch (ClassNotFoundException e){
            System.out.println("Error in Register the drive Classs"+ e.getMessage());

        }
    }

    public Connection getMyConnection(){
        registerMyConnection();
        try {
            myCon = DriverManager.getConnection(url,user,password);
            System.out.println("Successfully in creating the connection...");
        } catch (SQLException e) {
            System.out.println("Error in getting connection..." + e.getMessage());
        }
        return myCon;
    }
}
