public class MyDatabaseDemo {
    public static void main(String[] args) {
        //Display students
        //new DisplayStudent().displayAllStudents();

        //Add a student
        //new InsertStudent().insertSingleStudent("TG006","Kusala", "Matara");

        //Update a student name by id
        //new UpdateStudent().updateStudentNameById("TG006", "Janith");

        //Delete a student by id
        new DeleteStudent().deleteStudentById("TG006");
    }
}
