import java.sql.*;
import java.util.Arrays;

public class CalculatorMarks {

    private String  Grade;
    private double Quiz01,Quiz02,Quiz03,Quiz04;
    private double Assainment01;
    private double Assainment02;
    private double Practical01;
    private double Theory01;


    double Average;
    double AvgPre;
    double Assasment01pre10;
    double Assasment02pre20;
    double PracticalMarkPre30;
    double ThoryPre30;
    double TotalMarks;
    double TotalGrade;


    private DBConnector myCon;
    private Connection con;
    private Statement st;

    private ResultSet rs;


    public double bestQuiz(String reg_no){
        myCon = new DBConnector();
        con = myCon.getMyConnection();

        try {
            st = con.createStatement();
            String mysqlquery = "SELECT `Quiz_01`, `Quiz_02`, `Quiz_03`, `Quiz_04` FROM marks WHERE Reg_No = '"+ reg_no +"'";
            rs = st.executeQuery(mysqlquery);

            while (rs.next()){
                Quiz01 = rs.getDouble("Quiz_01");
                Quiz02 = rs.getDouble("Quiz_02");
                Quiz03 = rs.getDouble("Quiz_03");
                Quiz04 = rs.getDouble("Quiz_04");
            }

        } catch (SQLException e) {
            System.out.printf("Error in display Quiz marks" +e.getMessage());
        }

        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.printf("Error in close connection" +e.getMessage());
            }
        }

        double [] quizMarks = {Quiz01,Quiz02,Quiz03,Quiz04};
//        System.out.printf(Arrays.toString(quizMarks));
        Arrays.sort(quizMarks);

        Average = ((quizMarks[1])+(quizMarks[2])+(quizMarks[3])/3);
        System.out.printf(String.valueOf(Average));

        avgPrecentage ();

    return Average;
    }




    public double avgPrecentage (){

        AvgPre = Average*(10.0/100.0);
        System.out.printf(String.valueOf("\n"+AvgPre+ "\n"));

        return AvgPre;
    }






    public double Assainment01Return(String reg_no){
        myCon = new DBConnector();
        con = myCon.getMyConnection();


        try {
            st = con.createStatement();
            String mysqlQuary2 = "SELECT `Assesment_01` FROM marks WHERE Reg_No = '"+ reg_no +"'";
            rs = st.executeQuery(mysqlQuary2);

            while (rs.next()){
                Assainment01 = rs.getDouble("Assesment_01");
            }

        }catch (SQLException e){
            System.out.printf("Error in display Assainment 01" +e.getMessage());
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                System.out.printf("Error connection close" +e.getMessage());
            }
        }

        Assasment01pre10 =  Assainment01*(10.0/100.0);
        System.out.println("Assasmnet 10% "+Assasment01pre10);

        return Assasment01pre10;
    }





    public double Assainment02Return(String reg_no) {
        myCon = new DBConnector();
        con = myCon.getMyConnection();

        try {
            st = con.createStatement();
            String mysqlQuary3 = "SELECT `Assesment_02` FROM marks WHERE Reg_No = '" + reg_no + "'";
            rs = st.executeQuery(mysqlQuary3);

            while (rs.next()) {
                Assainment02 = rs.getDouble("Assesment_02");
            }

        } catch (SQLException e) {
            System.out.printf("Error in display Assainment 02" + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error connection close" + e.getMessage());
            }
        }

        Assasment02pre20 = Assainment02 * (20.0 / 100.0);
        System.out.println("Assasment 10% :  " +Assasment02pre20);

        return Assasment02pre20;
    }




    public double PracticalReturn(String reg_no) {
        myCon = new DBConnector();
        con = myCon.getMyConnection();

        try {
            st = con.createStatement();
            String mysqlQuary4 = "SELECT `Practical` FROM marks WHERE Reg_No = '" + reg_no + "'";
            rs = st.executeQuery(mysqlQuary4);

            while (rs.next()) {
                Practical01 = rs.getDouble("Practical");
            }

        } catch (SQLException e) {
            System.out.printf("Error in display practical" + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error connection close" + e.getMessage());
            }
        }

        PracticalMarkPre30 = Practical01 * (30.0 / 100.0);
        System.out.println("Practical 30% :  " +PracticalMarkPre30);

        return PracticalMarkPre30;
    }



    public double Thory01Return(String reg_no) {
        myCon = new DBConnector();
        con = myCon.getMyConnection();

        try {
            st = con.createStatement();
            String mysqlQuary4 = "SELECT `theory` FROM marks WHERE Reg_No = '" + reg_no + "'";
            rs = st.executeQuery(mysqlQuary4);

            while (rs.next()) {
                Theory01 = rs.getDouble("theory");
            }

        } catch (SQLException e) {
            System.out.printf("Error in display Theory" + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error connection close" + e.getMessage());
            }
        }

        ThoryPre30 = Theory01 * (30.0 / 100.0);
        System.out.println("Thory 30% :  " +ThoryPre30);

        return ThoryPre30;
    }

    public double totalMarks(String reg_no){

        TotalMarks = avgPrecentage()+Thory01Return(reg_no)+Assainment01Return(reg_no)+Assainment02Return(reg_no)+PracticalReturn(reg_no)+Thory01Return(reg_no);
        System.out.println("\nTotal Marks : " + TotalMarks);

        return TotalMarks;
    }

    public double totalGradeReturn(String reg_no) {

        double GradeValue = totalMarks(reg_no);

        if ((GradeValue >= 85) && (GradeValue <= 100)) {
            Grade = "A+";
        } else if ((GradeValue >= 70) && (GradeValue <= 84)) {
            Grade = "A";
        } else if ((GradeValue >= 65) && (GradeValue <= 69)) {
            Grade = "A-";
        } else if ((GradeValue >= 60) && (GradeValue <= 64)) {
            Grade = "B+";
        } else if ((GradeValue >= 55) && (GradeValue <= 59)) {
            Grade = "B-";
        } else if ((GradeValue >= 50) && (GradeValue <= 54)) {
            Grade = "C+";
        } else if ((GradeValue >= 45) && (GradeValue <= 49)) {
            Grade = "C";
        } else if ((GradeValue >= 40) && (GradeValue <= 44)) {
            Grade = "C";
        } else if ((GradeValue >= 35) && (GradeValue <= 39)) {
            Grade = "C-";
        } else if ((GradeValue >= 30) && (GradeValue <= 34)) {
            Grade = "D+";
        } else if ((GradeValue >= 25) && (GradeValue <= 29)) {
            Grade = "D";
        } else if ((GradeValue >= 0) && (GradeValue <= 24)) {
            Grade = "E";
        }

        System.out.println(Grade);
        return TotalGrade;
    }

}
