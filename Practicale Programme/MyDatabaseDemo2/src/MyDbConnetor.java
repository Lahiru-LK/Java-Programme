import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnetor {

    //db connection

    String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "";


    //connection object
    private Connection mycon = null;

    //Register the drive
    private void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbs.Drive");
            System.out.printf("Succeseefully registerd...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error in register the drive class "+e.getMessage());
        }
    }


    //2 . Creat and reruing the connection
    public Connection getMyConnetcion(){

        //register the driver
        registerMyConnection();

        try {
            mycon = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.printf("Error in getting Connetcion.."+e.getMessage());
        }
        return mycon;
    }



}
