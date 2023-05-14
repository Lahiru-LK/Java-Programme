import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnector {
    // Connection object
    private Connection myConnection = null;
    // URL to your database
    private String url = "jdbc:mysql://localhost:3306/student";
    // Username of the user which use to access the database
    private String user = "root";
    // password of the user which use to access the database
    private String pw = "1234";
    //Register the Driver
    private void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully Connected");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in registering the diver" + ex.getMessage());
        }
    }

    // Create and Return the connection
    public Connection getMyConnection(){
        //Call the register method
        registerMyConnection();

        try {
            myConnection = DriverManager.getConnection(url, user, pw);
        } catch (SQLException ex) {
            System.out.println("Error in getting connection");
        }
        return myConnection;
    }
}
