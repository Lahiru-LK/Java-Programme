import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySemester02 {

    String CourseCode;
    String Grade;

    double formatNrCGPA;
    double formatNrSGPA;
    int lastCousecodeNumber;
    double SGPA,CGPA;
    double SGpCreditSum,CGpCreditSum;

    double SGpSum,CGpSum= 0.0;

    double Gp;

    private DBConnector myCon;
    private Connection con;
    private Statement st;

    private ResultSet rs;

    public double semesterSGPA(){

        int count = 0;

        myCon = new DBConnector();
        con = myCon.getMyConnection();


        try {
            st = con.createStatement();

            String mysqlquery = "SELECT * FROM `semester_02`" ;
            rs = st.executeQuery(mysqlquery);

            while (rs.next()){


                    CourseCode = rs.getString("Cource_Code");
                    Grade = rs.getString("Grade");

                    Gp = getGradePoint(Grade);

//                 System.out.println("\t"+CourseCode+"\t"+Grade+"");

                 lastCousecodeNumber = CourseCode.charAt(CourseCode.length() - 1) - '0'; ; //කොස්කෝඩ් කොඩ් එකෙ ලෙන්ත් එකේ අන්තිම අන්කය ගැනීම

                 SGpCreditSum = (lastCousecodeNumber * Gp );
                 SGpSum = SGpSum + SGpCreditSum;

                 count += lastCousecodeNumber;

            }
            SGPA = SGpSum/count;

        } catch (SQLException e) {
            System.out.printf("Error in display SGPA" +e.getMessage());
        }

        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.printf("Error in close connection" +e.getMessage());
            }
        }


        String formattedNumberGPA = String.format("%.4f", SGPA);
        formatNrSGPA = Double.parseDouble(formattedNumberGPA);
//        System.out.println("\n\n"+"Semester 02 - Student SGPA : "+formattedNumberGPA);

        return formatNrSGPA;
    }



    public double getGradePoint(String Gradepoint) {

        switch (Gradepoint) {
            case "A+":
                Gp = 4.0;
                return Gp;
            case "A":
                Gp = 4.0;
                return Gp;
            case "A-":
                Gp = 3.7;
                return Gp;
            case "B+":
                Gp = 3.3;
                return Gp;
            case "B":
                Gp = 3.0;
                return Gp;
            case "B-":
                Gp = 2.7;
                return Gp;
            case "C+":
                Gp = 2.3;
                return Gp;
            case "C":
                Gp = 2.0;
                return Gp;
            case "C-":
                Gp = 1.7;
                return Gp;
            case "D+":
                Gp = 1.3;
                return Gp;
            case "D":
                Gp = 1.0;
                return Gp;
            case "E":
                Gp = 0.0;
                return Gp;
            case "F":
                Gp = 0.0;
                return Gp;
            default:
                Gp = 0.0;
                return Gp;
        }
    }




    public double semesterCGPA(){

        int count = 0;

        myCon = new DBConnector();
        con = myCon.getMyConnection();


        try {
            st = con.createStatement();

            String mysqlquery = "SELECT * FROM `semester_02`" ;
            rs = st.executeQuery(mysqlquery);

            while (rs.next()){

                CourseCode = rs.getString("Cource_Code");
                Grade = rs.getString("Grade");

                Gp = getGradePoint(Grade);

//              System.out.println("\t"+CourseCode+"\t"+Grade+"");

                lastCousecodeNumber = CourseCode.charAt(CourseCode.length() - 1) - '0'; ; //කොස්කෝඩ් කොඩ් එකෙ ලෙන්ත් එකේ අන්තිම අන්කය ගැනීම

                CGpCreditSum = (lastCousecodeNumber * Gp );
                CGpSum = CGpSum + CGpCreditSum;

                count += lastCousecodeNumber;

            }
            CGPA = CGpSum/count;

        } catch (SQLException e) {
            System.out.printf("Error in display SGPA" +e.getMessage());
        }

        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.printf("Error in close connection" +e.getMessage());
            }
        }




        mySemester01 x = new mySemester01();

        double b = (x.semesterCGPA()+CGPA)/2;

        String formattedNumberGPA = String.format("%.4f", b);
        formatNrCGPA = Double.parseDouble(formattedNumberGPA);

//        System.out.println("\n\n"+"Semester 02 - Student CGPA : "+formatNrGPA);

        return formatNrCGPA;
    }




}
