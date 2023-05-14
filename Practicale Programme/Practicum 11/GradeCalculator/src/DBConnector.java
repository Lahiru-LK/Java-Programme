import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private String url =  "jdbc:mysql://localhost:3306/ict";
    private String username = "root";
    private String password = "";

    private Connection myCon = null;


    private void registerMyConnection (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("\nRegister Connection Susscusfuly");
        } catch (ClassNotFoundException e) {
            System.out.printf("\nError register\n");
        }
    }

    public Connection getMyConnection (){

        registerMyConnection();

        try {

            myCon = DriverManager.getConnection(url, username, password);
//            System.out.printf("Connection Succusfuly\n\n");

        } catch (SQLException e) {
            System.out.printf("\nError Connection\n");
        }

        return myCon;
    }

}
