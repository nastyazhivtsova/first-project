package first_create_class;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStidentCount){
        this.groupName = someGroupName;
        this.studentCount = someStidentCount;
    }

    String getGroupName(){
        return groupName;
    }

    int getStudentCount(){
        return studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo(){
        System.out.println("Название группы: " + groupName + " Количество студентов: " + studentCount);
    }



}
