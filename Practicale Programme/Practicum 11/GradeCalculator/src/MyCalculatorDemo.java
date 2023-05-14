public class MyCalculatorDemo {
    public static void main(String[] args) {

//        DBConnector nedb = new DBConnector(); //object
//        nedb.getMyConnection();

//        new CalculatorMarks().bestQuiz("ICT001"); //anonimus object


//        CalculatorMarks mk = new CalculatorMarks();
//
//        mk.bestQuiz("ICT001");
//
//        mk.Assainment01Return("ICT001");
//
//        mk.Assainment02Return("ICT001");
//
//        mk.PracticalReturn("ICT001");
//
//        mk.Thory01Return("ICT001");
//
//        mk.totalMarks("ICT001");
//
//        mk.totalGradeReturn("ICT001");

//        CalculatorMarks ass05 = new CalculatorMarks();
//        ass05.totalMarks("ICT001");



        mySemester01 myrs = new mySemester01();
        System.out.println( "\n\nSemester 01 - Student SGPA "+myrs.semesterSGPA()   );
        System.out.println( "Semester 01 - Student CGPA "+myrs.semesterCGPA()   );

        mySemester02 myrss = new mySemester02();
        System.out.println( "\n\nSemester 02 - Student SGPA "+myrss.semesterSGPA()    );
        System.out.println( "Semester 02 - Student CGPA "+myrss.semesterCGPA()    );



    }
}
