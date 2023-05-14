import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnector {
    //URL for my Db
    private String url = "jdbc:mysql://localhost:3306/student";
    //User name
    private String user = "root";
    //password
    private String pw = "1234";

    //Connection obj
    private Connection myCon = null;

    //1. Register the Driver
    private void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully registered...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error in registering the drive class..."+ e.getMessage());
        }
    }

    //2. Create and returning the connection
    public Connection getMyConnection(){
        //register the driver
        registerMyConnection();

        try {
            myCon = DriverManager.getConnection(url,user,pw);
            System.out.println("Successfully in creating the connection...");
        } catch (SQLException e) {
            System.out.println("Error in getting connection..." + e.getMessage());
        }
        return myCon;
    }

}
