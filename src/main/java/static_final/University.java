package static_final;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(String someStudentName, int someStudentID){
        this.studentName = someStudentName;
        this.studentID = someStudentID;
    }


    static String changeUniversityName(String newName){
        return universityName = newName;
    }

    String getStudentName(){
        return studentName;
    }

    int getStudentID(){
        return studentID;
    }

   void printStudentInfo(){
        System.out.println("Имя студента:"+ getStudentName() + " ID Студента:" + getStudentID() + " Университет: " + universityName);
   }





}
